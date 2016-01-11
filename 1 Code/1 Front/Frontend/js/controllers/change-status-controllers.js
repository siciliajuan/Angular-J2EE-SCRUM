angular.module('supportTool').
controller('StatusController',function($routeParams,Projects,$location, Nav){
	var proj = Projects.getProjectByNotificationId($routeParams.id);
	Nav.setNotification($routeParams.id);
	Nav.setProjName(proj.name);
	Nav.setProject(proj.id);
	this.notificationId = Nav.getNotification();
	this.projectName = Nav.getProjName();
	this.projectId = Nav.getProject();
	this.change = {};
	this.change.statusAnt = Projects.getNotificationById(Nav.getNotification()).status;
	var statusAnt = this.change.statusAnt;
	this.changeStatus = function (){
		this.change.comment.fecha = new Date();
		this.change.comment.statusAnt = statusAnt;
		this.change.comment.statusAct = this.change.status;
		Projects.addNotificationComment(this.change.comment, Nav.getNotification());
		Projects.changeNotificationStatus(this.change.status, Nav.getNotification());
		var urlRed = '/support/notifications/' + Nav.getProject();
		$location.path(urlRed);
	};
});