/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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


}
