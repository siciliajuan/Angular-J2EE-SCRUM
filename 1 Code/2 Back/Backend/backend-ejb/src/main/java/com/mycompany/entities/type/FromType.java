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
public enum FromType {
    
    AUTHOR(0), SERVICEATENCION(1);

    private final int value;

    FromType(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }
}
