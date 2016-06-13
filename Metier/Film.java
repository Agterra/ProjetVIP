/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;


public class Film {
    private int Annee;
    private String Titre;
    private int Visa;
    private String Genre;

    /**
     *Constructeur
     */
    public Film() {
    }

    /**
     *Constructeur
     * @param visa
     * @param Titre
     * @param annee
     * @param Genre
     */
    public Film(int visa, String Titre, int annee, String Genre) {
        this.Annee = annee;
        this.Titre = Titre;
        this.Visa = visa;
        this.Genre = Genre;
    }

    /**
     *
     * @return
     */
    public int getAnnee() {
        return Annee;
    }

    /**
     *
     * @param Annee
     */
    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

    /**
     *
     * @return
     */
    public String getTitre() {
        return Titre;
    }

    /**
     *
     * @param Titre
     */
    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    /**
     *
     * @return
     */
    public int getVisa() {
        return Visa;
    }

    /**
     *
     * @param Visa
     */
    public void setVisa(int Visa) {
        this.Visa = Visa;
    }

    /**
     *
     * @return
     */
    public String getGenre() {
        return Genre;
    }

    /**
     *
     * @param Genre
     */
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return   Titre ;
    }
    
    
}
