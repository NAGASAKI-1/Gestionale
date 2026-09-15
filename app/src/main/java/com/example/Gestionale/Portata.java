/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.Gestionale;

/**
 *
 * @author nano_machine
 */
public enum Portata {
    ANTIPASTO("Antipasto"), 
    PRIMO("Primo"), 
    SECONDO("Secondo"), 
    CONTORNO("Contorno"), 
    BEVANDA("Bevanda"), 
    DOLCE("Dolce"),
    ALTRO("Altro");
    
    private String descrizione;
    
    private Portata(String descrizione) {
        this.descrizione = descrizione;
    }
    
    @Override
    public String toString() {
        return descrizione;
    }
}

