/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.transfer;

import com.mycompany.entities.Customer;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *To be used as JSON
 * 
 * @author Juan
 */
@XmlRootElement(name = "project")
public class ProjectTO {
    
    private int id;
    private String name;
    private CustomerTO customer;
    private List<NotificationTO> notifications;

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
     * @return the customer
     */
    @XmlElement
    public CustomerTO getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(CustomerTO customer) {
        this.customer = customer;
    }

    /**
     * @return the notifications
     */
    @XmlElement
    public List<NotificationTO> getNotifications() {
        return notifications;
    }

    /**
     * @param notifications the notifications to set
     */
    public void setNotifications(List<NotificationTO> notifications) {
        this.notifications = notifications;
    }
}
