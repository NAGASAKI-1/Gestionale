/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Gestionale;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author nano_machine
 */
public class Pietanza {
    private String nomePietanza;
    private Portata portata;
    private String ingredienti;
    private String allergeni;
    private String note;
    private boolean senzaGlutine;
    private boolean vegetariano;
    private boolean vegano;
    private boolean senzaLattosio;
    private ImageIcon immagine;
    private float prezzo;
    private String pathImmagine;
    
    
    //costruttore
    public Pietanza(String nomePietanza, Portata portata, String ingredienti, String allergeni, String note, boolean senzaGlutine, boolean vegetariano, boolean vegano, boolean senzaLattosio, ImageIcon immagine, float prezzo) {
        this.nomePietanza = nomePietanza;
        this.portata = portata;
        this.ingredienti = ingredienti;
        this.allergeni = allergeni;
        this.note = note;
        this.senzaGlutine = senzaGlutine;
        this.vegetariano = vegetariano;
        this.vegano = vegano;
        this.senzaLattosio = senzaLattosio;
        this.immagine = immagine;
        this.prezzo = prezzo;
    }
    
    public Pietanza() {
        //costruttore di default
    }
    
    
    //getter
    public String getNomePietanza() {
        return nomePietanza;
    }

    public Portata getPortata() {
        return portata;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public String getAllergeni() {
        return allergeni;
    }

    public String getNote() {
        return note;
    }

    public boolean isSenzaGlutine() {
        return senzaGlutine;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public boolean isVegano() {
        return vegano;
    }

    public boolean isSenzaLattosio() {
        return senzaLattosio;
    }

    public String getPathImmagine() {
        return pathImmagine;
    }

    public float getPrezzo() {
        return prezzo;
    }
    
    
    
    
    //setter
    public void setNomePietanza(String nomePietanza) {
        this.nomePietanza = nomePietanza;
    }

    public void setPortata(Portata portata) {
        this.portata = portata;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void setAllergeni(String allergeni) {
        this.allergeni = allergeni;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSenzaGlutine(boolean senzaGlutine) {
        this.senzaGlutine = senzaGlutine;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public void setSenzaLattosio(boolean senzaLattosio) {
        this.senzaLattosio = senzaLattosio;
    }

    public void setPathImmagine(String pi) {
        this.pathImmagine = pi;
        immagine = new ImageIcon(pi);
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    
    
    
    
}
