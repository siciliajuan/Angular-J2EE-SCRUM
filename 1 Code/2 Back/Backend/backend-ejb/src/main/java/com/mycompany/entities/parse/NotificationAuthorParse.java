/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.NotificationAuthorTO;
import com.mycompany.entities.NotificationAuthor;

/**
 * To convert from NotificationAuthor to NotificationAuthorTO  and viceversa
 * 
 * @author Juan
 */
public class NotificationAuthorParse {
    
    public static NotificationAuthorTO parse (NotificationAuthor newAuthor){
        NotificationAuthorTO author = new NotificationAuthorTO();
        author.setId(newAuthor.getId());
        author.setName(newAuthor.getName());
        author.setEmail(newAuthor.getEmail());
        author.setPhone(newAuthor.getPhone());
        return author;
    }
    
    public static NotificationAuthor parse (NotificationAuthorTO newAuthor){
        NotificationAuthor author = new NotificationAuthor();
        author.setId(newAuthor.getId());
        author.setName(newAuthor.getName());
        author.setEmail(newAuthor.getEmail());
        author.setPhone(newAuthor.getPhone());
        return author;
    }
}
