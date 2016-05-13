/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.sql.DataSource;

/**
 *
 * @author Louis
 */
public class SourceMySql {
     public static DataSource getSource() throws Exception {
        // récupération des informations d'authentification
        String user = "p1422645";
        String pwd = "234452";
        // création d'un objet Properties à parir du fichier 
        Properties props = new Properties();
        FileInputStream fichier = new FileInputStream("src/connexion.properties");
        props.load(fichier);
        MysqlDataSource ds = new MysqlDataSource();
        ds.setPortNumber(Integer.parseInt(props.getProperty("port")));
        ds.setDatabaseName(props.getProperty("service"));
        ds.setServerName(props.getProperty("serveur"));
        ds.setUser(user);
        ds.setPassword(pwd);
        System.out.println("Connecté(e)"+ds);
        return ds;
    }
}
