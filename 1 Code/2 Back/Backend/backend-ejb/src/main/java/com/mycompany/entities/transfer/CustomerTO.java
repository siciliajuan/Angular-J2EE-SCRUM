/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.transfer;

import com.mycompany.entities.CustomerContact;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *To be used as JSON
 * 
 * @author Juan
 */
@XmlRootElement(name = "customer")
public class CustomerTO {
    
    private int id;
    private String name;
    private CustomerContactTO contact;

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
     * @return the name
     */
    @XmlElement
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    @XmlElement
    public CustomerContactTO getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(CustomerContactTO contact) {
        this.contact = contact;
    }
}
