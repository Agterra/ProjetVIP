/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author nan c'est pas moi
 */
public class Event {
    
    private int idVip1,idVip2;
    private String lieuMariage;
    private Date dateDiv=null,dateMar=null;

    public Event() {
    }

    public Event(int idVip1, int idVip2, String lieuMariage, Date dateMar) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.lieuMariage = lieuMariage;
        this.dateMar = dateMar;
    }

    public Event(int idVip1, int idVip2, Date dateDiv) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.dateDiv = dateDiv;
    }

    public int getIdVip1() {
        return idVip1;
    }

    public int getIdVip2() {
        return idVip2;
    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public Date getDateDiv() {
        return dateDiv;
    }

    public Date getDateMar() {
        return dateMar;
    }

    public void setIdVip1(int idVip1) {
        this.idVip1 = idVip1;
    }

    public void setIdVip2(int idVip2) {
        this.idVip2 = idVip2;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public void setDateDiv(Date dateDiv) {
        this.dateDiv = dateDiv;
    }

    public void setDateMar(Date dateMar) {
        this.dateMar = dateMar;
    }
    
    
    
}
