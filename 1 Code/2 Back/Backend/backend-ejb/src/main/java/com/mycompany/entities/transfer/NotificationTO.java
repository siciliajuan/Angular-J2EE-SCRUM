/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.transfer;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *To be used as JSON
 * 
 * @author Juan
 */
@XmlRootElement(name = "notification")
public class NotificationTO {
    
    private int id;
    private NotificationAuthorTO author;
    private String title;
    private String description;
    private List<CommentTO> comments;
    private int status;
    private int level;
    private Date fecha;

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
     * @return the author
     */
    @XmlElement
    public NotificationAuthorTO getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(NotificationAuthorTO author) {
        this.author = author;
    }

    /**
     * @return the title
     */
    @XmlElement
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    @XmlElement
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the comments
     */
    @XmlElement
    public List<CommentTO> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<CommentTO> comments) {
        this.comments = comments;
    }

    /**
     * @return the status
     */
    @XmlElement
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the level
     */
    @XmlElement
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
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
    
    
}
