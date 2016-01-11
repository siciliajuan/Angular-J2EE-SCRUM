/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manager.interfaces;

import com.mycompany.entities.transfer.ProjectTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juan
 */
@Local
public interface IProjectManager {
    /**
    *This method return all project on database and convert it all into object
    * that can be used as JSON
    * 
    * @author Juan
     * @return return all project on database and convert it all into object
    * that can be used as JSON
    */
    List<ProjectTO> getAllProjects();
}
