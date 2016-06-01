/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author Claire
 */
public class Photo {
    private int idVip;
    private String idPhoto;
    private String lien;
    private String lieu;
    private Date laDate;
    
    public Photo(int idVip, String idPhoto,Date laDate,String lien,String lieu) {
        this.idVip = idVip;
        this.idPhoto = idPhoto;
        this.lien = lien;
        this.lieu=lieu;
    }

    public Photo() {
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getLaDate() {
        return laDate;
    }

    public void setLaDate(Date laDate) {
        this.laDate = laDate;
    }

    @Override
    public String toString() {
        return "Photo{" + "idVip=" + idVip + ", idPhoto=" + idPhoto + ", lien=" + lien + ", lieu=" + lieu + ", laDate=" + laDate + '}';
    }
    
    
}
