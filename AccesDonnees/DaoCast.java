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
public class DaoCast {
     private final Connection connexion;
     
       public DaoCast(Connection connexion) throws SQLException {
        this.connexion = connexion;
        
    }
       
    public void insertCast (int id, int visa) throws SQLException{
        String requete = "insert into Casting values(?,?);";
            PreparedStatement pstmt = connexion.prepareStatement(requete);
             pstmt.setInt(1,id );
            
             pstmt.setInt(2, visa);
            pstmt.executeUpdate();
            pstmt.close();
    }
    public void SupprtReal (int id, int visa) throws SQLException{
        String requete = "delete from Casting where idVip=? and numVisa=? ";
            PreparedStatement pstmt = connexion.prepareStatement(requete);
             pstmt.setInt(1,id );
            
             pstmt.setInt(2, visa);
            pstmt.executeUpdate();
            pstmt.close();
    }
}
