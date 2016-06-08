/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Claire
 */
public class Casting {
    private int numVisa;
    private int idVip;

    public Casting(int numVisa, int idVip) {
        this.numVisa = numVisa;
        this.idVip = idVip;
    }

    public Casting() {
    }

    public int getNumVisa() {
        return numVisa;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }
    
    
}
