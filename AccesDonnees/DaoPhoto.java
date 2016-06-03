/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Photo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
       
         if(this.existIDPhoto(img.getIdPhoto())==true){
             throw new Exception("La photo existe deja");
         }
        String requete = "insert into Photo values(?,?,?,?,?)";

        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img.getIdVip());
        pstmt.setString(2, img.getIdPhoto());
        pstmt.setDate(3, img.getLaDate());
        pstmt.setString(4, img.getLieu());
        pstmt.setString(5, img.getLien());

        pstmt.executeUpdate();
        pstmt.close();
    }

    public void supprimerPhoto(String id) throws SQLException {
        String requete = "delete from Photo where idphoto = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setString(1, id);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public boolean existIDPhoto(String id) throws SQLException {
        int nb = 0;
        String requete = "select idphoto from Photo where idphoto=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setString(1, id);
        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {
            nb++;
        }
        if (nb == 1) {
            return true;
        }
        return false;
    }

    public void lireLesPhotos(List<Photo> lesPhotos) throws SQLException {
        String requete = "select * from Photo";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        while (rset.next()) {       // traitement du résulat
            int numVip = rset.getInt(1);
            String idPhoto = rset.getString(2);
            Date datePdv = rset.getDate(3);
            String lien = rset.getString(4);
            String lieu = rset.getString(5);
            

            Photo temp = new Photo(numVip, idPhoto,datePdv, lien, lieu);
            lesPhotos.add(temp);
        }
        rset.close();
        pstmt.close();
    }
}
