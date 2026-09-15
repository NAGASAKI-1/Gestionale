/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Gestionale;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nano_machine
 */
public class Tavolo {
    public final float PREZZO_COPERTO = 2;
    private int numTavolo;
    private int numPosti;
    private int numCoperti;
    private StatoTavolo statoTavolo;
    private ArrayList<Pietanza> ordine;
    
    Tavolo(int nt, int np) {
        numTavolo = nt;
        numPosti = np;
        statoTavolo = StatoTavolo.LIBERO;
        ordine = new ArrayList<>();
    }
    
    Tavolo() {
        ordine = new ArrayList<>();
    }
    
    //getter
    public int getNumTavolo() {
        return numTavolo;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public ArrayList<Pietanza> getOrdine() {
        return ordine;
    }

    public int getNumCoperti() {
        return numCoperti;
    }
    
    
    //setter

    public void setNumTavolo(int numTavolo) {
        this.numTavolo = numTavolo;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    public void setOrdine(ArrayList<Pietanza> ordine) {
        this.ordine = ordine;
    }

    public void setNumCoperti(int numCoperti) {
        this.numCoperti = numCoperti;
    }
    
    //metodi
    public void aggiungiOrdine(Pietanza p) {
        ordine.add(p);
    }
    
    public void rimuoviOrdine(Pietanza p) {
        ordine.remove(ordine.indexOf(p));
    }
    
    public float calcolaTotale() {
        if (ordine != null) {
        float par = 0;
        for (int i = 0; i < ordine.size(); i++)
            par += ordine.get(i).getPrezzo();
        return (PREZZO_COPERTO * numCoperti) + par;
        }
        return 0.0f;
    }
    
}
