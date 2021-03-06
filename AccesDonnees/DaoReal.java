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
public class DaoReal {

    private final Connection connexion;

    /**
     * Constructeur
     *
     * @param connexion
     * @throws SQLException
     */
    public DaoReal(Connection connexion) throws SQLException {
        this.connexion = connexion;

    }

    /**
     * insertion d'un couple film realisateur
     *
     * @param id int id du vip
     * @param visa int visa du film
     * @throws SQLException
     */
    public void insertReal(int id, int visa) throws SQLException {
        String requete = "insert into Realise values(?,?);";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, id);

        pstmt.setInt(2, visa);
        pstmt.executeUpdate();
        pstmt.close();
    }

    /**
     * suppression d'un couple film realisateur
     *
     * @param visa int
     * @throws SQLException
     */
    public void SupprtReal( int visa) throws SQLException {
        String requete = "delete from Realise where  numVisa=? ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        
        pstmt.setInt(1, visa);
        pstmt.executeUpdate();
        pstmt.close();
    }

}
