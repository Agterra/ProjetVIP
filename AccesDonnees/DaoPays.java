/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoPays {
     private final Connection connexion;
     private List<String> lesPays;
     
    /**
     * Constructeur
     * @param connexion
     * @throws SQLException
     */
    public DaoPays(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }

    /**
     *Selection de tout les pays
     * @return List de Pays
     * @throws Exception
     */
    public List<String> SelectPays() throws Exception {
        lesPays= new ArrayList();
        String requete = "Select * from pays";  
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        System.out.println(rset);
        while (rset.next()) {// traitement du résulat
            String nom = rset.getString(1);
                    
          //Pays temp = new Pays(nom);
            lesPays.add(nom);
        }
        rset.close();
        pstmt.close();
        return lesPays;
     }
   
}
