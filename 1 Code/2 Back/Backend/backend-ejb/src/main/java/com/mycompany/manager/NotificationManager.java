/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manager;

import com.mycompany.dao.ProjectDAO;
import com.mycompany.dao.interfaces.INotificationDAO;
import com.mycompany.entities.Comment;
import com.mycompany.entities.parse.CommentParse;
import com.mycompany.entities.transfer.CommentTO;
import com.mycompany.manager.interfaces.INotificationManager;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan
 */
@Stateless
public class NotificationManager implements INotificationManager{
 
    final static Logger logger = Logger.getLogger(ProjectDAO.class);    
    
    @EJB
    INotificationDAO notificationDAO;

    @Override
    public boolean addCommentToNotification(CommentTO commentTO,int notificationID) {
        Comment comment = CommentParse.parse(commentTO);
        logger.debug("The comment is gonna be persisted");
        return notificationDAO.addCommentToNotification(comment, notificationID);
    }
    
    
}
