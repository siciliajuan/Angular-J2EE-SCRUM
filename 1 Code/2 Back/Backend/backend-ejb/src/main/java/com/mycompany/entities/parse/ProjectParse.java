/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.parse;

import com.mycompany.entities.transfer.NotificationTO;
import com.mycompany.entities.transfer.ProjectTO;
import com.mycompany.entities.Notification;
import com.mycompany.entities.Project;
import java.util.ArrayList;
import java.util.List;

/**
 * To convert from Project to ProjectTO  and viceversa
 * 
 * @author Juan
 */
public class ProjectParse {
    
    public static ProjectTO parse (Project newProject){
        ProjectTO project = new ProjectTO();
        project.setId(newProject.getId());
        project.setName(newProject.getName());
        project.setCustomer(CustomerParse.parse(newProject.getCustomer()));
        List<Notification> newNots = newProject.getNotifications();
        List<NotificationTO> nots = new ArrayList();
        if(newNots != null){
            for( int i = 0 ; i < newNots.size() ; i++ ){
                nots.add(NotificationParse.parse(newNots.get(i)));
            }
        }
        project.setNotifications(nots);
        return project;
    }
    
    public static Project parse (ProjectTO newProject){
        Project project = new Project();
        project.setId(newProject.getId());
        project.setName(newProject.getName());
        project.setCustomer(CustomerParse.parse(newProject.getCustomer()));
        List<NotificationTO> newNots = newProject.getNotifications();
        List<Notification> nots = new ArrayList();
        if(newNots != null){
            for( int i = 0 ; i < newNots.size() ; i++ ){
                nots.add(NotificationParse.parse(newNots.get(i)));
            }
        }
        project.setNotifications(nots);
        return project;
    }
}
