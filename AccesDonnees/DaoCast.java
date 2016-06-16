/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Claire et louis
 */
public class DaoCast {

    private final Connection connexion;

    /**
     * Constructeur
     *
     * @param connexion
     * @throws SQLException
     */
    public DaoCast(Connection connexion) throws SQLException {
        this.connexion = connexion;

    }

    /**
     * insertion d'un casting
     *
     * @param id int id de l'acteur
     * @param visa int nulmero visa
     * @throws SQLException
     */
    public void insertCast(int id, int visa) throws SQLException {
        String requete = "insert into Casting values(?,?);";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, id);

        pstmt.setInt(2, visa);
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * Suppression d'un Acteur
     *
     * @param id
     * @param visa
     * @throws SQLException
     */
    public void supprActeur(int id, int visa) throws SQLException {
        String requete = "delete from Casting where idVip=? and numVisa=? ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, id);

        pstmt.setInt(2, visa);
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * Suppression d'un Casting
     *
     * @param visa
     * @throws SQLException
     */
    public void supprCasting(int visa) throws SQLException {
        String requete = "delete from Casting where numVisa=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, visa);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
