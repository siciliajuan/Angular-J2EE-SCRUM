/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.CommentTO;
import com.mycompany.entities.Comment;

/**
 *To convert from Comment to CommentTO and viceversa
 * 
 * @author Juan
 */
public class CommentParse {
    
    public static CommentTO parse(Comment newComment){
        CommentTO comment = new CommentTO();
        comment.setId(newComment.getId());
        comment.setComment(newComment.getComment());
        comment.setFecha(newComment.getFecha());
        comment.setFrom(newComment.getFrom());
        comment.setStatusAct(newComment.getStatusAct());
        comment.setStatusAnt(newComment.getStatusAnt());
        return comment;
    }
    
    public static Comment parse(CommentTO newComment){
        Comment comment = new Comment();
        comment.setId(newComment.getId());
        comment.setComment(newComment.getComment());
        comment.setFecha(newComment.getFecha());
        comment.setFrom(newComment.getFrom());
        comment.setStatusAct(newComment.getStatusAct());
        comment.setStatusAnt(newComment.getStatusAnt());
        return comment;
    }
}
