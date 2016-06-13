/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;


public class Photo {
    private int idVip;
    private String idPhoto;
    private String lien;
    private String lieu;
    private Date laDate;
    
    /**
     *Constructeur
     * @param idVip
     * @param idPhoto
     * @param laDate
     * @param lieu
     * @param lien
     */
    public Photo(int idVip, String idPhoto,Date laDate,String lieu,String lien) {
        this.idVip = idVip;
        this.idPhoto = idPhoto;
        this.lien = lien;
        this.lieu=lieu;
        this.laDate=laDate;
    }

    /**
     *
     */
    public Photo() {
    }

    /**
     *
     * @return
     */
    public int getIdVip() {
        return idVip;
    }

    /**
     *
     * @param idVip
     */
    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    /**
     *
     * @return
     */
    public String getIdPhoto() {
        return idPhoto;
    }

    /**
     *
     * @param idPhoto
     */
    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
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
     * @param lien
     */
    public void setLien(String lien) {
        this.lien = lien;
    }

    /**
     *
     * @return
     */
    public String getLieu() {
        return lieu;
    }

    /**
     *
     * @param lieu
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     *
     * @return
     */
    public Date getLaDate() {
        return this.laDate;
    }

    /**
     *
     * @param laDate
     */
    public void setLaDate(Date laDate) {
        this.laDate = laDate;
    }

    @Override
    public String toString() {
        return "Photo{" + "idVip=" + idVip + ", idPhoto=" + idPhoto + ", laDate=" + laDate+ ", lieu=" + lieu+ ", lien=" + lien  + '}';
    }
    
    
}
