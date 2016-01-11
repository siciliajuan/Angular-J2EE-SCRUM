/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.CustomerContactTO;
import com.mycompany.entities.CustomerContact;

/**
 *To convert from CustomerContact to ComCustomerContactTO  and viceversa
 * 
 * @author Juan
 */
public class CustomerContactParse {
    
    public static CustomerContactTO parse(CustomerContact newContact){
        CustomerContactTO contact = new CustomerContactTO();
        contact.setId(newContact.getId());
        contact.setName(newContact.getName());
        contact.setLastname(newContact.getLastname());
        contact.setEmail(newContact.getEmail());
        contact.setPhone(newContact.getPhone());
        contact.setPassword(newContact.getPassword());
        return contact;
    }
    
    public static CustomerContact parse(CustomerContactTO newContact){
        CustomerContact contact = new CustomerContact();
        contact.setId(newContact.getId());
        contact.setName(newContact.getName());
        contact.setLastname(newContact.getLastname());
        contact.setEmail(newContact.getEmail());
        contact.setPhone(newContact.getPhone());
        contact.setPassword(newContact.getPassword());
        return contact;
    }
}
