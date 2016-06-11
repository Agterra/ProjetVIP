/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;


public class Evenements {
    
    private int idVip1,idVip2;
    private String lieuMariage;
    private Date dateDiv=null,dateMar=null;
    private int type=0;
    private String Vip1;
    private String Vip2;

    public Evenements(int idVip1, int idVip2, String lieuMariage,int type) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.lieuMariage = lieuMariage;
        this.type=type;
    }
    public Evenements() {
        
    }

    public Evenements(int idVip1, int idVip2, String lieuMariage, Date dateMar) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.lieuMariage = lieuMariage;
        this.dateMar = dateMar;
    }

    public Evenements(int idVip1, int idVip2, Date dateDiv) {
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        this.dateDiv = dateDiv;
    }
     public Evenements(String Vip1, String Vip2,int idVip1, int idVip2,Date dateMar) {
        this.Vip1 = Vip1;
        this.Vip2 = Vip2;
        this.idVip1 = idVip1;
        this.idVip2 = idVip2;
        
        this.dateMar = dateMar;
        
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
    

   @Override
    public String toString() {
        return "Marié:"+Vip1+" et "+Vip2+" ";
    }
    
    
    
}
