/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;


import com.mycompany.entities.Comment;
import com.mycompany.entities.parse.CommentParse;
import com.mycompany.entities.transfer.CommentTO;
import com.mycompany.entities.transfer.ProjectTO;
import com.mycompany.manager.interfaces.INotificationManager;
import com.mycompany.manager.interfaces.IProjectManager;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/services")
public class CustomerRestService {
 
    @EJB
    IProjectManager projectManager;
    
    @EJB
    INotificationManager notificationManager;
    
    /**
     * Just to test RESTEasy
     * @param msg
     * @return 
     */
    @GET
    @Path("/printmessage/{param}")
    public Response printMessage(@PathParam("param") String msg) {
            String result = "Restful Return! : " + msg;
            return Response.status(200).entity(result).build();

    }
    
    
    /**
     * Just to test RESTEasy returns JSON data
     */
    public class ObjectA {
           private int id = 0;
           private String name = "Hola JSON";
           
           public int getId(){return this.id;}
           public String getName(){return this.name;}
    }
    /**
     * Just to test RESTEasy returns JSON data
     */
    @GET
    @Path("/getJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJSON(){
       
        ObjectA res = new ObjectA();
        //String res = "Restful Return!";
        return Response.status(200).entity(res).build();

    }
    
    @GET
    @Path("/getProjects")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProjects(){
        List<ProjectTO> res = projectManager.getAllProjects();
        return Response.status(200).entity(res).build();

    }
    
    @PUT
    @Path("/addComment")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addComment(Comment newComment, int notificationId){
        CommentTO comment = CommentParse.parse(newComment);
        boolean res = notificationManager.addCommentToNotification(comment, notificationId);
        return Response.status(200).entity(res).build();
    }

}
