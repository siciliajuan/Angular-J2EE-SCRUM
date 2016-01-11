/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dao.interfaces.DAOInterface;
import com.mycompany.dao.interfaces.INotificationDAO;
import com.mycompany.entities.Comment;
import com.mycompany.entities.Notification;
import com.mycompany.utils.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan
 */
@Stateless
public class NotificationDAO implements DAOInterface<Notification>, INotificationDAO{

    final static Logger logger = Logger.getLogger(ProjectDAO.class);
    
    private EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    
    @Override
    public Notification create(Notification object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Notification getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Notification> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Notification update(Notification object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addCommentToNotification(Comment comment, int notificationID) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Notification not = em.find(Notification.class, notificationID);
            List<Comment> comments =  not.getComments();
            comments.add(comment);
            not.setComments(comments);
            transaction.commit();
            em.close();
            logger.debug("Persisting comment went OK");
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
