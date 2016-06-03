/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.Film;
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
public class DaoFilm {
     private final Connection connexion;
   
     
    public DaoFilm(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
     public void insererFilm(Film film) throws Exception {
       
         if(this.existVisa(film.getVisa())==true){
             throw new Exception("La photo existe deja");
         }
        String requete = "insert into Film values(?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, film.getVisa());
        pstmt.setString(2, film.getTitre());
        pstmt.setString(3, film.getGenre());
        pstmt.setInt(3, film.getAnnee());
        pstmt.executeUpdate();
        pstmt.close();
    }
     
     public void supprimerFilm(int film) throws SQLException {
        String requete = "delete from Film where numVisa = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, film);
        pstmt.executeUpdate();
        pstmt.close();
    }
     
     public boolean existVisa(int id) throws SQLException {
        int nb=0;
        String requete = "select idphoto from Film where numVisa=?";
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
