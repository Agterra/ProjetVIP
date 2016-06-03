/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Evenements;
import Metier.VIP;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoEvent {

    private final Connection connexion;
    private DaoVIP daoVip;
    private final Date div = null;
    private List<Evenements> listeMar;

    public DaoEvent(Connection connexion) throws SQLException {
        this.connexion = connexion;
        daoVip=new DaoVIP(connexion);
    }

//    public Date sontMarie(int numVip1, int numVip2) throws SQLException {
//        int conjoint;
//        Date mar;
//        Date div = null;
//        String requete = "select idVip2,dateMar from Event where dateDiv IS NULL AND idVip=? ";
//        PreparedStatement pstmt = connexion.prepareStatement(requete);
//        pstmt.setInt(1, numVip1);
//       // pstmt.setDate(2, null);
//        ResultSet rset = pstmt.executeQuery();
//        while (rset.next()) {
//            conjoint = rset.getInt(1);
//            mar = rset.getDate(2);
//            if (conjoint == numVip2) {
//                return mar;
//            }
//        }
//        requete = "select idVip2,dateMar from Event where dateDiv=null AND idVip=? ";
//        pstmt = connexion.prepareStatement(requete);
//        pstmt.setInt(1, numVip2);
//       // pstmt.setDate(1, null);
//        rset = pstmt.executeQuery();
//        while (rset.next()) {
//            conjoint = rset.getInt(1);
//            mar = rset.getDate(2);
//            if (conjoint == numVip1) {
//                return mar;
//            }
//        }
//        pstmt.close();
//        return div;
//    }

    public void addMariage(int numVip1, int numVip2, Date dateMar, String Lieu) throws Exception {
        try {
        if (numVip1 == numVip2) {
            throw new Exception(" Meme vip");
        }

        daoVip = new DaoVIP(connexion);
       
        

        
            String requete = "insert into Event values(?,null,?,?,?);";
            PreparedStatement pstmt = connexion.prepareStatement(requete);
             pstmt.setInt(1, numVip2);
             pstmt.setString(2, Lieu);
             pstmt.setDate(3, dateMar);
             pstmt.setInt(4, numVip1);
            pstmt.executeUpdate();
            pstmt.close();
            daoVip.updateStatut(numVip2, 1);
            daoVip.updateStatut(numVip1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addDivorce(int numVip1, int numVip2, Date dateDiv,Date DateMar) throws Exception {
        
        if (DateMar.equals(div)) {
            throw new Exception("Ne divorcer pas le meme jours");
        }
         if (DateMar==null) {
            throw new Exception("non marier");
        }
        if (DateMar.after(dateDiv)==true) {
            System.out.println(dateDiv+" "+DateMar);
            throw new Exception("marier avant de se divorcer");
        }
        //modfi de la date de div
        try {
            String requete = "update  Event set dateDiv=? where idVip =? and dateMar=? OR idVip2=? and dateMar=?";
            PreparedStatement pstmt = connexion.prepareStatement(requete);
            pstmt.setDate(1, dateDiv);
            pstmt.setInt(2, numVip1);
            pstmt.setInt(4, numVip2);
            pstmt.setDate(3, DateMar);
            pstmt.setDate(5, DateMar);
            pstmt.executeUpdate();
            daoVip.updateStatut(numVip2, -1);
            daoVip.updateStatut(numVip1, -1);
             System.out.println(numVip2+" "+numVip1);
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public List<Evenements> SelectMarier() throws Exception {
        listeMar= new ArrayList();
        String requete = "Select idVip,idVip2,dateMar from Event where dateDiv IS NULL";  
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery();
        
       // System.out.println(rset);
        while (rset.next()) {// traitement du résulat
            
           String nomvip1=daoVip.getNom(rset.getInt(1));
            Date date=rset.getDate(3);
            String nomvip2=daoVip.getNom(rset.getInt(2));
           // System.out.println(idvip2);
         
            Evenements temp = new Evenements(nomvip1,nomvip2,rset.getInt(1),rset.getInt(2),date);
            listeMar.add(temp);
        }
        rset.close();
        pstmt.close();
        return listeMar;
     }

}
