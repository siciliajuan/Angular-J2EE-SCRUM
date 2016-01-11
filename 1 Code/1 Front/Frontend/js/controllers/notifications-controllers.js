angular.module('supportTool').
controller('NotificationsController',function($routeParams,Projects,Nav){
	Nav.setProject($routeParams.id);
	Nav.setProjName( Projects.getProjectById(Nav.getProject() ).name);
	this.nots = Projects.getNotificationsByProjectId(Nav.getProject());
	this.projectId = Nav.getProject();
	this.projectName = Nav.getProjName();
});