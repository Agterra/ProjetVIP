/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetVIP.Metier;

/**
 *
 * @author Claire
 */
public class Photo {
    private int idVip;
    private int idPhoto;
    private String lien;

    public Photo(int idVip, int idPhoto, String lien) {
        this.idVip = idVip;
        this.idPhoto = idPhoto;
        this.lien = lien;
    }

    public Photo() {
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
    
}
