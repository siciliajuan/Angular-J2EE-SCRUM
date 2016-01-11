angular.module('supportTool').
controller('projectsController',function($scope,Projects){
	$scope.projects = Projects.all();
	$scope.projectStatus = getProjectNotificationStatus;
});

/*  
* return 0 if require atencion
* return 1 if don't need atencion
*/
function getProjectNotificationStatus (project){
	var ret = 2;
	for(var i = 0 ; i < project.notifications.length ; i++){
		if (project.notifications[i].status == 0 ||
			project.notifications[i].status == 1 ||
			project.notifications[i].status == 2 ||
			project.notifications[i].status == 6 ){
			ret = 0;
		}else if (project.notifications[i].status == 0 ||
			project.notifications[i].status == 3 ||
			project.notifications[i].status == 4 ||
			project.notifications[i].status == 5 ){
			ret = 1;
		}
	};
	return ret;
};