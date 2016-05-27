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
        if (daoVip.existe(img.getIdVip()) != true) {
            throw new Exception("Le VIP n'existe pas");
        }
        if (this.existIDPhoto(img.getIdPhoto()) == true) {
            throw new Exception("La photo existe deja");
        }
        String requete = "insert into Photo values(?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img.getIdVip());
        pstmt.setInt(2, img.getIdPhoto());
        pstmt.setDate(3, img.getLaDate());
        pstmt.setString(4, img.getLieu());
        pstmt.setString(5, img.getLien());

        pstmt.executeUpdate();
        pstmt.close();
    }

    public void supprimerPhoto(int img) throws SQLException {
        String requete = "delete from Photo where idphoto = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public boolean existIDPhoto(int id) throws SQLException {
        int nb = 0;
        String requete = "select idphoto from Photo where idphoto=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, id);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {
            nb = rset.getInt(1);
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
            int idPhoto = rset.getInt(2);
            Date datePdv = rset.getDate(3);
            String lieu = rset.getNString(4);
            String lien = rset.getString(9);

            Photo temp = new Photo(numVip, idPhoto,datePdv, lieu, lien);
            lesPhotos.add(temp);
        }
        rset.close();
        pstmt.close();
    }
}
