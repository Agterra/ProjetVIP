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
 * @author Claire
 */
public class DaoReal {
     private final Connection connexion;
     
       public DaoReal(Connection connexion) throws SQLException {
        this.connexion = connexion;
        
    }
       
    public void insertReal (int id, int visa) throws SQLException{
        String requete = "insert into Realise values(?,?);";
            PreparedStatement pstmt = connexion.prepareStatement(requete);
             pstmt.setInt(1,id );
            
             pstmt.setInt(2, visa);
            pstmt.executeUpdate();
            pstmt.close();
    }
}
