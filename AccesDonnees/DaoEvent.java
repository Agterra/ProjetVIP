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
     //en cours de réalisation....
     public void sontMarie(int numVip1, int numVip2) throws SQLException {
        String requete = "select idVip,idVip2 from Event where idVip = ? and idVip2 = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip1);
        ResultSet rset = pstmt.executeQuery(requete);
        String code1 = rset.getString(8);
        
        pstmt.close();
    }
}
