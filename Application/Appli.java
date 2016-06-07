/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoFilm;
import AccesDonnees.DaoGenre;
import AccesDonnees.DaoPays;
import AccesDonnees.DaoPhoto;
import AccesDonnees.DaoVIP;
import AccesDonnees.SourceMySql;
import IHM.FenetreApplication;
import Model.ModelJTableVIP;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxCS;
import Model.ModeleComboBoxGenre;
import Model.ModeleComboBoxMarier;
import Model.ModeleComboBoxPays;

import Model.ModeleComboBoxVIP1M;

import Model.ModeleComboBoxVIP2M;
import Model.ModeleJTableFilm;

import Model.ModeleJTablePhotos;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Louis
 */
public class Appli {

    private static DataSource laSourceDeDonnees;
    private static Connection laConnexion;
    private static DaoVIP daoVip;
    private static DaoPays leDaoPays;
    private static DaoEvent daoEvent;
    private static DaoPhoto daoPhoto;
    private static DaoFilm daoFilm;
    private static DaoGenre daoGenre;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.print(e.getMessage());
        }

        // Etablissement de la connexion à la base MySql avec affichage de la fenetre d'identification 
        boolean etat = false;

        //        PasswordAuthentication login = new PasswordAuthentication("p1422645",234452);
        try {
            laSourceDeDonnees = SourceMySql.getSource();
            laConnexion = laSourceDeDonnees.getConnection();
            etat = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(),
                    "avertissement", JOptionPane.WARNING_MESSAGE);
        }

        // Instanciation des objets nécessaires à l'application
        try {
            // les DAO nécessaires
            daoVip = new DaoVIP(laConnexion);
            leDaoPays = new DaoPays(laConnexion);
            daoEvent = new DaoEvent(laConnexion);
            daoPhoto = new DaoPhoto(laConnexion);
            daoFilm = new DaoFilm(laConnexion);
            daoGenre = new DaoGenre(laConnexion);
            
            // les modèles de données avec le DAO à partir duquel se feront les échanges de données
            final ModelJTableVIP leModele = new ModelJTableVIP(daoVip);

            final ModeleComboBoxCR crCB= new ModeleComboBoxCR();
            final ModeleComboBoxCS csCB=new ModeleComboBoxCS();
            final ModeleComboBoxPays paysCB=new ModeleComboBoxPays(leDaoPays);

         
            final ModeleComboBoxVIP1M mvCB1M = new ModeleComboBoxVIP1M(daoVip,daoEvent);
            final ModeleComboBoxVIP2M mvCB2M = new ModeleComboBoxVIP2M(daoVip,daoEvent);
            final ModeleComboBoxGenre mvCBGenre = new ModeleComboBoxGenre(daoGenre);
            final ModeleComboBoxMarier mvCBMar = new ModeleComboBoxMarier(daoEvent);

            final ModeleJTablePhotos leModelePhoto = new ModeleJTablePhotos(daoPhoto);
            final ModeleJTableFilm leModeleFilm = new ModeleJTableFilm(daoFilm);


            // la fenetre principale de l'application qui tourne dans l'EDT
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    new FenetreApplication(leModele, crCB, csCB, paysCB,mvCB1M,mvCB2M,mvCBGenre,mvCBMar,leModelePhoto,leModeleFilm,daoEvent,daoVip).setVisible(true);

                }
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problème dans la création des objets nécessaires" + ex.getMessage(),
                    "avertissement", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur:" + e.getMessage(),
                    "avertissement", JOptionPane.WARNING_MESSAGE);
        }
    }

}
