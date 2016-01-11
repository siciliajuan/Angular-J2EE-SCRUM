/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.CustomerTO;
import com.mycompany.entities.Customer;

/**
 * To convert from Customer to CustomerTO  and viceversa
 * 
 * @author Juan
 */
public class CustomerParse {
    
    public static CustomerTO parse(Customer newCustomer){
        CustomerTO customer = new CustomerTO();
        customer.setId(newCustomer.getId());
        customer.setName(newCustomer.getName());
        customer.setContact(CustomerContactParse.parse(newCustomer.getContact()));
        return customer;
    }
    
    public static Customer parse(CustomerTO newCustomer){
        Customer customer = new Customer();
        customer.setId(newCustomer.getId());
        customer.setName(newCustomer.getName());
        customer.setContact(CustomerContactParse.parse(newCustomer.getContact()));
        return customer;
    }
    
}
