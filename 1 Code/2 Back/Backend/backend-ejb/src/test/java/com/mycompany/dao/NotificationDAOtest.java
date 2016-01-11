/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dao.interfaces.INotificationDAO;
import com.mycompany.dao.interfaces.IProjectDAO;
import com.mycompany.entities.Comment;
import com.mycompany.utils.EntityManagerUtil;
import java.util.Date;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Juan
 */
public class NotificationDAOtest {
    
    private EntityManager em;
    
    @EJB
    private INotificationDAO notificationDAO;
    
    @EJB
    private IProjectDAO projectDAO;
    
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
        Comment comment = new Comment();
        comment.setComment("Comentario molon rapido");
        comment.setFecha(new Date());
        comment.setFrom(0);
        comment.setStatusAct(2);
        comment.setStatusAnt(1);
        boolean bol = notificationDAO.addCommentToNotification(comment, 1);
        Assert.assertEquals(bol, true);
    }
}
