/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import ProjetVIP.Metier.VIP;
import java.sql.Connection;
import java.sql.Date;
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
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            String codeR = rset.getString(7);
            String codeS = rset.getString(8);
            String pays = rset.getString(9);
         
            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss,lieu,codeR,codeS,pays);
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
        String requete = "insert into vip values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, leVip.getIdVip());
        pstmt.setString(2, leVip.getNomVip());
        pstmt.setString(3, leVip.getPrenomVip());
        pstmt.setString(4, leVip.getCivilite());
        pstmt.setDate(5, (Date) leVip.getDateNaiss());
        pstmt.setString(6, leVip.getLieuNaiss());
        pstmt.setString(7, leVip.getCodeRole());
        pstmt.setString(8, leVip.getCodeStatut());
        pstmt.setString(9, leVip.getNomPays());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
