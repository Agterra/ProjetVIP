/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;


public class VIP {
    
    private static int incrIdVip=0;
    private int idVip;
    private String nomVip;
    private String prenomVip;
    private String civilite;
    private Date dateNaiss;
    private String lieuNaiss;
    private int codeRole;//rea,act
    private int codeStatut;//mar,ceb,div
    private String nomPays;
    
    /**
     *Constructeur vide
     */
    public VIP(){
        
    }

    /**
     * Constructeur
     * @param id
     * @param nomVIP
     * @param prenomVip
     * @param civilite
     * @param dateNaiss
     * @param lieuNaiss
     * @param codeRole
     * @param codeStatut
     * @param nomPays
     */
    public VIP(int id,String nomVIP, String prenomVip, String civilite, Date dateNaiss, String lieuNaiss, int codeRole, int codeStatut, String nomPays) {
        this.idVip = id;
        this.nomVip = nomVIP;
        this.prenomVip = prenomVip;
        this.civilite = civilite;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.codeRole = codeRole;
        this.codeStatut = codeStatut;
        this.nomPays = nomPays;
        this.incrIdVip++;
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
     * @return
     */
    public String getNomVip() {
        return nomVip;
    }

    /**
     *
     * @return
     */
    public String getPrenomVip() {
        return prenomVip;
    }

    /**
     *
     * @return
     */
    public String getCivilite() {
        return civilite;
    }

    /**
     *
     * @return
     */
    public Date getDateNaiss() {
        return dateNaiss;
    }

    /**
     *
     * @return
     */
    public String getLieuNaiss() {
        return lieuNaiss;
    }

    /**
     *
     * @return
     */
    public int getCodeRole() {
        return codeRole;
    }

    /**
     *
     * @return
     */
    public int getCodeStatut() {
        return codeStatut;
    }

    /**
     *
     * @return
     */
    public String getNomPays() {
        return nomPays;
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
     * @param nomVIP
     */
    public void setNomVIP(String nomVIP) {
        this.nomVip = nomVIP;
    }

    /**
     *
     * @param prenomVip
     */
    public void setPrenomVip(String prenomVip) {
        this.prenomVip = prenomVip;
    }

    /**
     *
     * @param civilite
     */
    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    /**
     *
     * @param dateNaiss
     */
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    /**
     *
     * @param lieuNaiss
     */
    public void setLieuNaiss(String lieuNaiss) {
        this.lieuNaiss = lieuNaiss;
    }

    /**
     *
     * @param codeRole
     */
    public void setCodeRole(int codeRole) {
        this.codeRole = codeRole;
    }

    /**
     *
     * @param codeStatut
     */
    public void setCodeStatut(int codeStatut) {
        this.codeStatut = codeStatut;
    }

    /**
     *
     * @param nomPays
     */
    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Override
    public String toString() {
        return  nomVip ;
    }
    
    
    
}
