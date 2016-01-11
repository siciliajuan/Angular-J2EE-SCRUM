/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.type;

/**
 *
 * @author Juan
 */
public enum StatusType {
    
    OPEN(0), INPROGRESS(1),SOLVED(2),CERRADA(3),DUPLICADA(4), NOSERESUELVE(5),NECESITAFEEDBACK(6);

    private final int value;

    StatusType(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }
}
