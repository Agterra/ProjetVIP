/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Photo;
import Metier.PhotoFilm;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Claire et louis
 */
public class DaoFilmPhoto {

    private final Connection connexion;
    private AccesDonnees.DaoFilm daoFilm;

    /**
     *
     * @param connexion
     */
    public DaoFilmPhoto(Connection connexion) {
        this.connexion = connexion;
    }

    /**
     *
     * @param img
     * @throws Exception
     */
    public void insererPhoto(PhotoFilm img) throws Exception {

        if (this.existNomPhoto(img.getNomPhoto()) == true) {
            throw new Exception("La photo existe deja");
        }
        String requete = "insert into PhotoFilm values(?,?,?)";

        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, img.getNumVisa());
        pstmt.setString(2, img.getLien());
        pstmt.setString(3, img.getNomPhoto());
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * Supprimer Photo
     *
     * @param nom String
     * @throws SQLException
     */
    public void supprimerPhoto(String nom) throws SQLException {
        String requete = "delete from PhotoFilm where nomPhoto = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setString(1, nom);
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * Vérification de l'existance de la photo
     *
     * @param Nom String
     * @return bool
     * @throws SQLException
     */
    public boolean existNomPhoto(String Nom) throws SQLException {
        int nb = 0;
        String requete = "select numVisa from PhotoFilm where nomPhoto=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setString(1, Nom);
        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {
            nb++;
        }
        if (nb == 1) {
            return true;
        }
        return false;
    }

    /**
     * Lecture de toutes les photos de films de la base
     *
     * @param lesPhotos List
     * @throws SQLException
     */
    public void lireLesPhotos(List<PhotoFilm> lesPhotos) throws SQLException {
        String requete = "select * from PhotoFilm";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        while (rset.next()) {       // traitement du résulat
            int numVisa = rset.getInt(1);
            String lien = rset.getString(2);
            String nomPhoto = rset.getString(3);

            PhotoFilm temp = new PhotoFilm(numVisa, lien, nomPhoto);
            lesPhotos.add(temp);
        }
        rset.close();
        pstmt.close();
    }
}
