/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author Claire et louis
 */
public class Evenements {

    private int idVip1, idVip2;
    private String lieuMariage;
    private Date dateDiv = null, dateMar = null;
    private int type = 0;
    private String Vip1;
    private String Vip2;

    /**
     * Constructeur
     *
     * @param idVip1
     * @param idVip2
     * @param lieuMariage
     * @param type
     */
    public Evenements(int idVip1, int idVip2, String lieuMariage, int type) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.lieuMariage = lieuMariage;
        this.type = type;
    }

    /**
     * Constructeur
     */
    public Evenements() {

    }

  
   
    /**
     * Constructeur avec nom
     *
     * @param Vip1
     * @param Vip2
     * @param idVip1
     * @param idVip2
     * @param dateMar
     */
    public Evenements(String Vip1, String Vip2, int idVip1, int idVip2, Date dateMar) {
        this.Vip1 = Vip1;
        this.Vip2 = Vip2;
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;

        this.dateMar = dateMar;

    }

    /**
     *
     * @return
     */
    public int getIdVip1() {
        return idVip1;
    }

    /**
     *
     * @return
     */
    public int getIdVip2() {
        return idVip2;
    }

    /**
     *
     * @return
     */
    public String getLieuMariage() {
        return lieuMariage;
    }

    /**
     *
     * @return
     */
    public Date getDateDiv() {
        return dateDiv;
    }

    /**
     *
     * @return
     */
    public Date getDateMar() {
        return dateMar;
    }

    /**
     *
     * @return
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     *
     * @param idVip1
     */
    public void setIdVip1(int idVip1) {
        this.idVip1 = idVip1;
    }

    /**
     *
     * @param idVip2
     */
    public void setIdVip2(int idVip2) {
        this.idVip2 = idVip2;
    }

    /**
     *
     * @param lieuMariage
     */
    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    /**
     *
     * @param dateDiv
     */
    public void setDateDiv(Date dateDiv) {
        this.dateDiv = dateDiv;
    }

    /**
     *
     * @param dateMar
     */
    public void setDateMar(Date dateMar) {
        this.dateMar = dateMar;
    }

    @Override
    public String toString() {
        return "Marié:" + Vip1 + " et " + Vip2 + " ";
    }

}
