/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.CommentTO;
import com.mycompany.entities.transfer.NotificationTO;
import com.mycompany.entities.Comment;
import com.mycompany.entities.Notification;
import java.util.ArrayList;
import java.util.List;

/**
 * To convert from Notification to NotificationTO  and viceversa
 * 
 * @author Juan
 */
public class NotificationParse {
    
    public static NotificationTO parse (Notification newNot){
        NotificationTO not = new NotificationTO();
        not.setId(newNot.getId());
        not.setDescription(newNot.getDescription());
        not.setTitle(newNot.getTitle());
        not.setFecha(newNot.getFecha());
        not.setLevel(newNot.getLevel());
        not.setStatus(newNot.getStatus());
        not.setAuthor(NotificationAuthorParse.parse(newNot.getAuthor()));
        List<Comment> newComments = newNot.getComments();
        List<CommentTO> comments = new ArrayList();
        if(newComments != null){
            for(int i = 0 ; i< newComments.size() ; i++){
                comments.add(CommentParse.parse(newComments.get(i)));
            }
        }
        not.setComments(comments);
        return not;
    }
    
    public static Notification parse (NotificationTO newNot){
        Notification not = new Notification();
        not.setId(newNot.getId());
        not.setDescription(newNot.getDescription());
        not.setTitle(newNot.getTitle());
        not.setFecha(newNot.getFecha());
        not.setLevel(newNot.getLevel());
        not.setStatus(newNot.getStatus());
        not.setAuthor(NotificationAuthorParse.parse(newNot.getAuthor()));
        List<CommentTO> newComments = newNot.getComments();
        List<Comment> comments = new ArrayList();
        if(newComments != null){
            for(int i = 0 ; i< newComments.size() ; i++){
                comments.add(CommentParse.parse(newComments.get(i)));
            }
        }
        not.setComments(comments);
        return not;
    }
}
