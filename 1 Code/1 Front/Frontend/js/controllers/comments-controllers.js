angular.module('supportTool').
controller('CommentsController',function($routeParams, Projects, Nav){
	var proj = Projects.getProjectByNotificationId($routeParams.id);
	Nav.setNotification($routeParams.id);
	Nav.setProjName(proj.name);
	Nav.setProject(proj.id);
	this.comments = Projects.getNotificationById(Nav.getNotification()).comments;
	this.author = Projects.getNotificationById(Nav.getNotification()).author.name;
	this.notificationId = Nav.getNotification();
	this.projectName = Nav.getProjName();
	this.projectId = Nav.getProject();
});