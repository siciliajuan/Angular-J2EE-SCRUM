/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dao.interfaces.DAOInterface;
import com.mycompany.dao.interfaces.IProjectDAO;
import com.mycompany.entities.Project;
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
public class ProjectDAO implements DAOInterface<Project>, IProjectDAO{
    
    final static Logger logger = Logger.getLogger(ProjectDAO.class);
    
    private EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();

    @Override
    public Project create(Project object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Project> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project update(Project object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Project> getAllProjects() {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            List<Project> projects = em.createQuery("SELECT e FROM Project e").getResultList();
            transaction.commit();
            em.close();
            logger.debug("Getting all projects OK");
            return projects;
        } catch (Exception ex) {
            return null;
        }
    }
}



/*
    public  void functionJustToTry(){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        SimpleObject object0 = null;
        SimpleObject object1 = null;
        object0 = new SimpleObject();
        object1 = new SimpleObject();
        object0.setVersion(1);
        object1.setVersion(2);
        em.merge(object0);
        em.merge(object1);
        transaction.commit();
        em.close();
    	logger.debug("Is running!");
        System.out.println( "Hello World!" );
    }
*/
