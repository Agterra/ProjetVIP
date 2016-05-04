/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import ProjetVIP.Metier.VIP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Louis
 */
public class DaoVIP {
     private final Connection connexion;

    public DaoVIP(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }

    public void lireLesVip(List<VIP> lesVips) throws SQLException {    
        String requete = "select * from vip";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String job = rset.getString(3);
            VIP temp = new VIP(num, nom, job);
            lesVips.add(temp);
        }
        rset.close();
        pstmt.close();     
    }

    public void supprimerVip(int numVip) throws SQLException {
        String requete = "delete from vip where numVip = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void insererVip(VIP leVip) throws SQLException {
        String requete = "insert into vip (empno, ename, job) values(?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, leVip.getNumEmp());
        pstmt.setString(2, leVip.getNomEmp());
        pstmt.setString(3, leVip.getJobEmp());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
