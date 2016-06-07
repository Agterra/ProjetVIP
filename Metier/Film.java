/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Claire
 */
public class Film {
    private int Annee;
    private String Titre;
    private int Visa;
    private String Genre;

    public Film() {
    }

    public Film(int visa, String Titre, int annee, String Genre) {
        this.Annee = annee;
        this.Titre = Titre;
        this.Visa = visa;
        this.Genre = Genre;
    }

    public int getAnnee() {
        return Annee;
    }

    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public int getVisa() {
        return Visa;
    }

    public void setVisa(int Visa) {
        this.Visa = Visa;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return   Titre ;
    }
    
    
}
