/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "comment")
public class Comment implements Serializable {
    
    
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //When it was created
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "status_ant")
    private int statusAnt;
    
    @Column(name = "status_act")
    private int statusAct;

    //related to FromType
    @Column(name = "writer")
    private int from;
    
    @Column(name = "comment")
    private String comment;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the statusAnt
     */
    public int getStatusAnt() {
        return statusAnt;
    }

    /**
     * @param statusAnt the statusAnt to set
     */
    public void setStatusAnt(int statusAnt) {
        this.statusAnt = statusAnt;
    }

    /**
     * @return the statusAct
     */
    public int getStatusAct() {
        return statusAct;
    }

    /**
     * @param statusAct the statusAct to set
     */
    public void setStatusAct(int statusAct) {
        this.statusAct = statusAct;
    }

    /**
     * @return the from
     */
    public int getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(int from) {
        this.from = from;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
}
