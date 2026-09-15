/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.Gestionale;

/**
 *
 * @author nano_machine
 */
public enum StatoTavolo {
    LIBERO("Libero"),
    OCCUPATO("Occupato"),
    ATTESA_CONTO("In attesa di conto"),
    ATTESA_PAGAMENTO("In attesa di pagamento");
    
    private String descrizione;
    
    private StatoTavolo(String descrizione) {
        this.descrizione = descrizione;
    }
    
    @Override
    public String toString() {
        return descrizione;
    }
}
