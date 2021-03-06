/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import AccesDonnees.DaoCast;
import AccesDonnees.DaoEvent;
import AccesDonnees.DaoFilm;
import AccesDonnees.DaoFilmPhoto;
import AccesDonnees.DaoGenre;
import AccesDonnees.DaoPays;
import AccesDonnees.DaoPhoto;
import AccesDonnees.DaoReal;
import AccesDonnees.DaoVIP;
import AccesDonnees.SourceMySql;
import IHM.FenetreApplication;
import IHM.FenetreIdentification;
import Model.ModelJTableVIP;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxFilm;
import Model.ModeleComboBoxGenre;
import Model.ModeleComboBoxMarier;
import Model.ModeleComboBoxPays;
import Model.ModeleComboBoxVIP;

import Model.ModeleComboBoxVIP1M;

import Model.ModeleComboBoxVIP2M;
import Model.ModeleComboBoxVIPAct;
import Model.ModeleComboBoxVIPReal;
import Model.ModeleJTableFilm;

import Model.ModeleJTablePhotos;
import Model.ModeleJTablePhotosFilms;
import java.net.PasswordAuthentication;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Claire et louis
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
    private static DaoCast daoCasting;
    private static DaoReal daoRealisateur;
    private static DaoFilmPhoto daoFilmPhoto;

    /**
     *
     */
    public static String memoId = "none";

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
        do {
            FenetreIdentification fi = new FenetreIdentification(null);
            PasswordAuthentication login = fi.identifier();

            try {
                laSourceDeDonnees = SourceMySql.getSource(login);
                laConnexion = laSourceDeDonnees.getConnection();
                etat = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Login incorrect : " + ex.getMessage(),
                        "Erreur", JOptionPane.WARNING_MESSAGE);
            }

        } while (etat == false);

        // Instanciation des objets nécessaires à l'application
        try {
            // les DAO nécessaires
            daoVip = new DaoVIP(laConnexion);
            leDaoPays = new DaoPays(laConnexion);
            daoEvent = new DaoEvent(laConnexion);
            daoPhoto = new DaoPhoto(laConnexion);
            daoFilm = new DaoFilm(laConnexion);
            daoGenre = new DaoGenre(laConnexion);
            daoCasting = new DaoCast(laConnexion);
            daoRealisateur = new DaoReal(laConnexion);
            daoFilmPhoto = new DaoFilmPhoto(laConnexion);

            // les modèles de données avec le DAO à partir duquel se feront les échanges de données
            final ModelJTableVIP leModele = new ModelJTableVIP(daoVip);

            final ModeleComboBoxCR modeleComboBoxRole = new ModeleComboBoxCR();
            final ModeleComboBoxPays modeleComboBoxPays = new ModeleComboBoxPays(leDaoPays);

            final ModeleComboBoxFilm modeleComboBoxFilms = new ModeleComboBoxFilm(daoFilm, daoCasting, daoRealisateur);
            final ModeleComboBoxVIPAct modeleComboBoxActeur = new ModeleComboBoxVIPAct(daoVip);
            final ModeleComboBoxVIPReal modeleComboBoxRealisateur = new ModeleComboBoxVIPReal(daoVip);
            final ModeleComboBoxVIP1M modeleComboBoxVipUn = new ModeleComboBoxVIP1M(daoVip, daoEvent);
            final ModeleComboBoxVIP2M modeleComboBoxVipDeux = new ModeleComboBoxVIP2M(daoVip);
            final ModeleComboBoxGenre modeleComboBoxGenre = new ModeleComboBoxGenre(daoGenre);
            final ModeleComboBoxMarier modeleComboBoxMariages = new ModeleComboBoxMarier(daoEvent);

            final ModeleJTablePhotos leModelePhoto = new ModeleJTablePhotos(daoPhoto);
            final ModeleJTableFilm leModeleFilm = new ModeleJTableFilm(daoFilm);
            final ModeleComboBoxVIP modeleComboBoxVip = new ModeleComboBoxVIP(daoVip);
            final ModeleJTablePhotosFilms leModelePhotoFilm = new ModeleJTablePhotosFilms(daoFilmPhoto);

            // la fenetre principale de l'application qui tourne dans l'EDT
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    new FenetreApplication(leModele, modeleComboBoxRole, modeleComboBoxPays, modeleComboBoxVipUn, modeleComboBoxVipDeux, modeleComboBoxGenre, modeleComboBoxMariages, leModelePhoto, leModeleFilm, daoEvent, daoVip, modeleComboBoxFilms, modeleComboBoxActeur, modeleComboBoxRealisateur, modeleComboBoxVip, leModelePhotoFilm).setVisible(true);

                }
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problème dans la création des objets nécessaires" + ex.getMessage(),
                    "Erreur", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur:" + e.getMessage(),
                    "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }

}
