/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;


import Metier.Pays;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Claire
 */
public class DaoPays {
     private final Connection connexion;
   
     
    public DaoPays(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
     public void SelectPays(List<Pays> lesPays) throws Exception {
         
        String requete = "Select * from pays";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        System.out.println(rset);
        while (rset.next()) {       // traitement du résulat
            String nom = rset.getString(1);
                    
            Pays temp = new Pays(nom);
            lesPays.add(temp);
        }
        rset.close();
        pstmt.close();
     }
   
}
