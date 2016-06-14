/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Agterra
 */
public class PhotoFilm {

    private int numVisa;
    private String lien;
    private String nomPhoto;

    public PhotoFilm(int numVisa, String lien, String nomPhoto) {
        this.numVisa = numVisa;
        this.lien = lien;
        this.nomPhoto = nomPhoto;
    }

    public PhotoFilm() {

    }

    public int getNumVisa() {
        return numVisa;
    }

    public String getLien() {
        return lien;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    @Override
    public String toString() {
        return "PhotoFilm{" + "numVisa=" + numVisa + ", lien=" + lien + ", nomPhoto=" + nomPhoto + '}';
    }

}
