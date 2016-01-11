/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manager;

import com.mycompany.entities.transfer.CommentTO;
import com.mycompany.manager.interfaces.INotificationManager;
import com.mycompany.manager.interfaces.IProjectManager;
import com.mycompany.utils.EntityManagerUtil;
import java.util.Date;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Juan
 */
public class NotificationManagerTest {
    
    private EntityManager em;
    
    @EJB
    private INotificationManager notificationManager;
    
    @EJB
    private IProjectManager projectManager;
    
    @Before
    public void beforeEach(){
           em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    @After
    public void afterEach(){
           em.close();
    }


    
    @Test
    public void addCommentToNotificationOK(){
        CommentTO comment = new CommentTO();
        comment.setComment("Comentario molon rapido");
        comment.setFecha(new Date());
        comment.setFrom(0);
        comment.setStatusAct(2);
        comment.setStatusAnt(1);
        boolean bol = notificationManager.addCommentToNotification(comment, 1);
        Assert.assertTrue(bol);
    }
}
