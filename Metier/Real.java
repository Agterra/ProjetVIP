/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

public class Real {

    private int numVisa;
    private int idVip;

    /**
     * Constructeur
     *
     * @param numVisa
     * @param idVip
     */
    public Real(int numVisa, int idVip) {
        this.numVisa = numVisa;
        this.idVip = idVip;
    }

    /**
     * Constructeur vide
     */
    public Real() {
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
     * @param numVisa
     */
    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
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

}
