/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import ProjetVIP.Metier.Photo;
import Metier.VIP;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Claire
 */
public class DaoPhoto {
     private final Connection connexion;
    private AccesDonnees.DaoVIP daoVip;
     
    public DaoPhoto(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
     public void insererPhoto(Photo img) throws Exception {
         daoVip = new DaoVIP(connexion);
         if(daoVip.existe(img.getIdVip())!=true){
             throw new Exception("Le VIP n'existe pas");
         }
         if(this.existIDPhoto(img.getIdPhoto())==true){
             throw new Exception("La photo existe deja");
         }
        String requete = "insert into vip values(?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img.getIdPhoto());
        pstmt.setInt(2, img.getIdPhoto());
        pstmt.setString(3, img.getLien());
        
        pstmt.executeUpdate();
        pstmt.close();
    }
     
     public void supprimerPhoto(int img) throws SQLException {
        String requete = "delete from photo where idphoto = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img);
        pstmt.executeUpdate();
        pstmt.close();
    }
     
     public boolean existIDPhoto(int id) throws SQLException {
        int nb=0;
        String requete = "select idPhoto from photo where idPhoto=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, id);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {   
                nb = rset.getInt(1);
            }
        if(nb==1){
            return true;
        }
        return false;
   }
}
