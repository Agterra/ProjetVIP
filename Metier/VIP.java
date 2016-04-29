/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.Date;

/**
 *
 * @author Louis
 */
public class VIP {
    
    private int idVip;
    private String nomVIP;
    private String prenomVip;
    private String civilite;
    private Date dateNaiss;
    private String lieuNaiss;
    private String codeRole;
    private String codeStatut;
    private String nomPays;

    public VIP(int idVip, String nomVIP, String prenomVip, String civilite, Date dateNaiss, String lieuNaiss, String codeRole, String codeStatut, String nomPays) {
        this.idVip = idVip;
        this.nomVIP = nomVIP;
        this.prenomVip = prenomVip;
        this.civilite = civilite;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.codeRole = codeRole;
        this.codeStatut = codeStatut;
        this.nomPays = nomPays;
    }

    public int getIdVip() {
        return idVip;
    }

    public String getNomVIP() {
        return nomVIP;
    }

    public String getPrenomVip() {
        return prenomVip;
    }

    public String getCivilite() {
        return civilite;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public String getLieuNaiss() {
        return lieuNaiss;
    }

    public String getCodeRole() {
        return codeRole;
    }

    public String getCodeStatut() {
        return codeStatut;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    public void setNomVIP(String nomVIP) {
        this.nomVIP = nomVIP;
    }

    public void setPrenomVip(String prenomVip) {
        this.prenomVip = prenomVip;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setLieuNaiss(String lieuNaiss) {
        this.lieuNaiss = lieuNaiss;
    }

    public void setCodeRole(String codeRole) {
        this.codeRole = codeRole;
    }

    public void setCodeStatut(String codeStatut) {
        this.codeStatut = codeStatut;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
    
    
    
}
