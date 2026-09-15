/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Gestionale;

import java.util.EventObject;

/**
 *
 * @author nano_machine
 */
public class PietanzaAggiuntaAllOrdineEvent extends EventObject {
    private final Pietanza p;

    public PietanzaAggiuntaAllOrdineEvent(Object source, Pietanza p) {
        super(source);
        this.p = p;
    }
    
    public Pietanza getPietanza() {
        return p;
    }
    
    
}
