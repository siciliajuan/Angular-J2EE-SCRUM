/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dao.interfaces.INotificationDAO;
import com.mycompany.dao.interfaces.IProjectDAO;
import com.mycompany.entities.Project;
import com.mycompany.utils.EntityManagerUtil;
import java.util.List;
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
public class ProjectDAOtest {
    
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
    public void getAllProjectsOK(){
        List<Project> projects = projectDAO.getAllProjects();
        Assert.assertEquals(4, projects.size());
    }
}
