/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoFilm {

    private final Connection connexion;
    private List<Film> ListeFilm;

    /**
     * Constructeur
     *
     * @param connexion
     * @throws SQLException
     */
    public DaoFilm(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }

    /**
     * Inserer un Film
     *
     * @param film Film
     * @throws Exception
     */
    public void insererFilm(Film film) throws Exception {

        String requete = "insert into Film values(?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, film.getVisa());
        pstmt.setString(2, film.getTitre());
        pstmt.setString(4, film.getGenre());
        pstmt.setInt(3, film.getAnnee());
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * Supprimer un Film
     *
     * @param film int le visa du film
     * @throws SQLException
     */
    public void supprimerFilm(int film) throws SQLException {
        String requete = "delete from Film where numVisa = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, film);
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     *
     * Selectionne tous les films
     *
     * @return List de film
     * @throws Exception
     */
    public List<Film> SelectFilm() throws Exception {
        ListeFilm = new ArrayList();
        String requete = "Select * from Film ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {// traitement du résulat
            int visa = rset.getInt(1);
            String titre = rset.getString(2);
            int Annee = rset.getInt(3);
            String Genre = rset.getString(4);

            Film temp = new Film(visa, titre, Annee, Genre);
            ListeFilm.add(temp);
        }
        rset.close();
        pstmt.close();
        return ListeFilm;
    }

}
