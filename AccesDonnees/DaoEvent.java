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

    public DaoEvent(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }
<<<<<<< HEAD
     //en cours de réalisation....
     public void sontMarier(int numVip1, int numVip2) throws SQLException {
        String requete = "select idVip,idVip2 from Event where idVip = ? and idVip2 = ?";
=======

    //en cours de réalisation....

    public boolean sontMarie(int numVip1, int numVip2) throws SQLException {
        int conjoint;
        Date div = new Date(0000, 00, 00);
        String requete = "select idVip2 from Event where idVip = ? and dateDiv=?";
>>>>>>> origin/master
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip1);
        pstmt.setDate(2, (Date) div);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {
            conjoint = rset.getInt(1);
            if (conjoint == numVip2) {
                return true;
            }
        }
        requete = "select idVip2 from Event where idVip = ? and dateDiv=?";
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip2);
        pstmt.setDate(2, (Date) div);
        rset = pstmt.executeQuery(requete);
        while (rset.next()) {
            conjoint = rset.getInt(1);
            if (conjoint == numVip1) {
                return true;
            }
        }
        pstmt.close();
        return false;
    }
}
