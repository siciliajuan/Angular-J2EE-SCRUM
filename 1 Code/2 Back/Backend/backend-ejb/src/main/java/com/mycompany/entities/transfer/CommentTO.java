/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.transfer;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *To be used as JSON
 * 
 * @author Juan
 */
@XmlRootElement(name = "comment")
public class CommentTO {
    
    private int id;
    private Date fecha;
    private int statusAnt;
    private int statusAct;
    private int from;
    private String comment;

    /**
     * @return the id
     */
    @XmlElement
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
    @XmlElement
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
    @XmlElement
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
    @XmlElement
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
    @XmlElement
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
    @XmlElement
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
