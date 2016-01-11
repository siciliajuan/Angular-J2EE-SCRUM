/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.interfaces;

import com.mycompany.entities.Comment;
import javax.ejb.Local;

/**
 *
 * @author Juan
 */
@Local
public interface INotificationDAO {
    /**
     * This method persist a given comment into its notification
     * 
     * @param comment Comment to be persisted
     * @param notificationID ID of the notification
     * @return true if everything went right, false in another case
     */
    boolean addCommentToNotification(Comment comment, int notificationID);
}
