/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Event;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DaoEvent {

    private final Connection connexion;
    private DaoVIP daoVip;
    private final Date div = new Date(0000, 00, 00);
    public DaoEvent(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }

    public Date sontMarie(int numVip1, int numVip2) throws SQLException {
        int conjoint;
        Date mar;
        Date div = new Date(0000, 00, 00);
        String requete = "select idVip2,dateMar from Event where idVip = ? and dateDiv=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip1);
        pstmt.setDate(2, (Date) div);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {
            conjoint = rset.getInt(1);
             mar = rset.getDate(2);
            if (conjoint == numVip2) {
                return mar;
            }
        }
        requete = "select idVip2 from Event where idVip = ? and dateDiv=?";
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip2);
        pstmt.setDate(2, (Date) div);
        rset = pstmt.executeQuery(requete);
        while (rset.next()) {
            conjoint = rset.getInt(1);
            mar = rset.getDate(2);
            if (conjoint == numVip1) {
                return mar;
            }
        }
        pstmt.close();
        return div;
    }

    public void addMariage(int numVip1, int numVip2, Date dateMar, String Lieu) throws Exception {
        
        if (numVip1 == numVip2) {
            throw new Exception(" Meme vip");
        }

        daoVip = new DaoVIP(connexion);
        if (daoVip.existe(numVip1) == false) {
            throw new Exception(numVip1+" n'exite pas");
        }
        if (daoVip.existe(numVip2) == false) {
            throw new Exception(numVip2+" n'exite pas");
        }
        if (daoVip.estMarier(numVip1) == true) {
            throw new Exception(numVip1+" est deja marier");
        }
        if (daoVip.estMarier(numVip2) == true) {
            throw new Exception(numVip2+" est deja marier");
        }
        try{
        String requete = "insert into Event values(?,\"0000-00-00\",?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip1);
        pstmt.setString(3, Lieu);
        pstmt.setDate(4, (Date) dateMar);
        pstmt.setInt(5, numVip2);
        pstmt.executeUpdate();
        pstmt.close();
        daoVip.updateStatut(numVip2, "mar");
        daoVip.updateStatut(numVip1, "mar");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     public void addDivorce(int numVip1, int numVip2, Date dateDiv) throws Exception{
         Date DateMar=sontMarie(numVip1,numVip2);
         if (DateMar==div){
             throw new Exception("Ne sont pas marier");
         }
         if (DateMar.after(dateDiv)){
             throw new Exception("Divorcer avant de se marier");
         }
      //modfi de la date de div
         try{
          String requete = "update  Event set dateDiv=? where numVip1 = ? && dateMar= ? OR numVip1=? && dateMar= ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip1);
        pstmt.setInt(3, numVip2);
        pstmt.setDate(2, DateMar);
        pstmt.setDate(4, DateMar);
        pstmt.executeUpdate();
        daoVip.updateStatut(numVip2, "div");
        daoVip.updateStatut(numVip1, "div");
        pstmt.close();
         }catch(Exception e){
              System.out.println(e.getMessage());
         }
     }
}
