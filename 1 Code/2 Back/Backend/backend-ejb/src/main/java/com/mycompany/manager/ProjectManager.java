/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manager;

import com.mycompany.dao.ProjectDAO;
import com.mycompany.dao.interfaces.IProjectDAO;
import com.mycompany.entities.Project;
import com.mycompany.entities.parse.ProjectParse;
import com.mycompany.entities.transfer.ProjectTO;
import com.mycompany.manager.interfaces.IProjectManager;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan
 */
@Stateless
public class ProjectManager implements IProjectManager{
    
    final static Logger logger = Logger.getLogger(ProjectDAO.class);    
    
    @EJB
    IProjectDAO projectDAO;

    @Override
    public List<ProjectTO> getAllProjects() {
        List<ProjectTO> projectsTO = null;
        List<Project> projects = projectDAO.getAllProjects();
        if(projects != null){
            projectsTO = new ArrayList();
            for( int i = 0 ; i< projects.size() ; i++){
                projectsTO.add(ProjectParse.parse(projects.get(i)));
            }
            logger.debug("Everything OK retrieving all projects on database");
        }else{
            logger.debug("Something went wrong  retrieving all projects or no projects on database");
        }
        return projectsTO;
    }
    
}
