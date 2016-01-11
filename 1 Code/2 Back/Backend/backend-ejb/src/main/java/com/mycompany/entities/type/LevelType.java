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
public enum LevelType {
    
    BJO(0), MEDIO(1),ALTO(2),CRITICO(3);

    private final int value;

    LevelType(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }
}
