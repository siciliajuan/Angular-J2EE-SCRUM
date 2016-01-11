/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manager.interfaces;

import com.mycompany.entities.transfer.CommentTO;

/**
 *
 * @author Juan
 */
public interface INotificationManager {
     /**
     * This method persist a given comment into its notification
     * 
     * @param commentTO Comment to be persisted (Is gonna be convert into Comment entity)
     * @param notificationID ID of the notification
     * @return true if everything went right, false in another case
     */
    boolean addCommentToNotification(CommentTO commentTO,int notificationID);
}
