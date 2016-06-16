/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Claire et louis
 */
public class PhotoFilm {

    private int numVisa;
    private String lien;
    private String nomPhoto;

    /**
     *
     * @param numVisa
     * @param lien
     * @param nomPhoto
     */
    public PhotoFilm(int numVisa, String lien, String nomPhoto) {
        this.numVisa = numVisa;
        this.lien = lien;
        this.nomPhoto = nomPhoto;
    }

    /**
     *
     */
    public PhotoFilm() {

    }

    /**
     *
     * @return
     */
    public int getNumVisa() {
        return numVisa;
    }

    /**
     *
     * @return
     */
    public String getLien() {
        return lien;
    }

    /**
     *
     * @return
     */
    public String getNomPhoto() {
        return nomPhoto;
    }

    /**
     *
     * @param numVisa
     */
    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    /**
     *
     * @param lien
     */
    public void setLien(String lien) {
        this.lien = lien;
    }

    /**
     *
     * @param nomPhoto
     */
    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    @Override
    public String toString() {
        return "PhotoFilm{" + "numVisa=" + numVisa + ", lien=" + lien + ", nomPhoto=" + nomPhoto + '}';
    }

}
