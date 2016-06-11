/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesDonnees;

import Metier.VIP;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoVIP {

    private final Connection connexion;
    private List<VIP> listeNomsIdVIP;

    public DaoVIP(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }

    public List<VIP> SelectVIP() throws Exception {
        listeNomsIdVIP = new ArrayList();
        String requete = "Select * from vip";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        System.out.println(rset);
        while (rset.next()) {// traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
            listeNomsIdVIP.add(temp);
        }
        rset.close();
        pstmt.close();
        return listeNomsIdVIP;
    }

    public List<VIP> SelectVIPNM() throws Exception {
        listeNomsIdVIP = new ArrayList();
        String requete = "Select * from vip where codeStatut!=1 ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {// traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
            listeNomsIdVIP.add(temp);
        }
        rset.close();
        pstmt.close();
        return listeNomsIdVIP;
    }

    public void lireLesVip(List<VIP> lesVips) throws SQLException {
        String requete = "select * from vip ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
            lesVips.add(temp);
        }
        rset.close();
        pstmt.close();
    }

    public void supprimerVip(int numVip) throws SQLException {
        String requete = "delete from vip where idVip = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void insererVip(VIP leVip) throws SQLException {
        String requete = "INSERT INTO `vip` ( `nomVIP` , `prenomVip` , `civilite` , `dateNaiss` , `lieuNaiss` , `codeRole` , `codeStatut` , `nomPays` )VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);

        pstmt.setString(1, leVip.getNomVip());
        pstmt.setString(2, leVip.getPrenomVip());
        pstmt.setString(3, leVip.getCivilite());
        pstmt.setDate(4, (Date) leVip.getDateNaiss());
        pstmt.setString(5, leVip.getLieuNaiss());
        pstmt.setInt(6, leVip.getCodeRole());
        pstmt.setInt(7, leVip.getCodeStatut());
        pstmt.setString(8, leVip.getNomPays());
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void ModVip(VIP leVip) throws SQLException {
        String requete = "UPDATE `vip` SET `nomVIP`=?,`prenomVip`=?,`civilite`=?,`dateNaiss`=?,`lieuNaiss`=?,`codeRole`=?,`codeStatut`=?,`nomPays`=? where idVip=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);

        pstmt.setString(1, leVip.getNomVip());
        pstmt.setString(2, leVip.getPrenomVip());
        pstmt.setString(3, leVip.getCivilite());
        pstmt.setDate(4, (Date) leVip.getDateNaiss());
        pstmt.setString(5, leVip.getLieuNaiss());
        pstmt.setInt(6, leVip.getCodeRole());
        pstmt.setInt(7, leVip.getCodeStatut());
        pstmt.setString(8, leVip.getNomPays());
        pstmt.setInt(9, leVip.getIdVip());
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void updateStatut(int numVip, int i) throws SQLException {
        String requete = "update  vip set codeStatut=? where idVip=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(2, numVip);
        pstmt.setInt(1, i);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public String getNom(int numVip) throws SQLException {
        String nom = " ";
        String requete = "select nomVIP from vip where idVip=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);

        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {// traitement du résulat

            nom = rset.getString(1);

        }

        rset.close();
        pstmt.close();
        return nom;
    }

    public VIP getVip(int numVip) throws SQLException {
        VIP temp = null;
        String requete = "select * from vip where idVip=?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);

        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {// traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
        }
        rset.close();
        pstmt.close();
        return temp;
    }

    public List<VIP> SelectVIPACteur() throws Exception {
        listeNomsIdVIP = new ArrayList();
        String requete = "Select * from vip where codeRole!=0";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        System.out.println(rset);
        while (rset.next()) {// traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
            listeNomsIdVIP.add(temp);
        }
        rset.close();
        pstmt.close();
        return listeNomsIdVIP;
    }

    public List<VIP> SelectVIPReal() throws Exception {
        listeNomsIdVIP = new ArrayList();
        String requete = "Select * from vip where codeRole!=1";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        System.out.println(rset);
        while (rset.next()) {// traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String prenom = rset.getString(3);
            String civ = rset.getString(4);
            Date dateNaiss = rset.getDate(5);
            String lieu = rset.getString(6);
            int codeR = rset.getInt(7);
            int codeS = rset.getInt(8);
            String pays = rset.getString(9);

            VIP temp = new VIP(num, nom, prenom, civ, dateNaiss, lieu, codeR, codeS, pays);
            listeNomsIdVIP.add(temp);
        }
        rset.close();
        pstmt.close();
        return listeNomsIdVIP;
    }
}
