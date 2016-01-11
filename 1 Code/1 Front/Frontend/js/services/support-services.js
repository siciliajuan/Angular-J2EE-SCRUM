angular.module('supportTool').
factory('Projects', function ProjectsFactory(){
  var projs = projects;
  return {
    all: function() { 
    	return projs; 
    },
    getProjectById: function(id){
    	return getProjectById(projects, id);
    },
    getProjectByNotificationId: function(id){
    	return getProjectByNotificationId(projects, id);
    },  
    getNotificationById: function(id){
    	return getNotificationById(projs, id);
    },
    getNotificationsByProjectId: function (id){
    	return getNotificationsByProjectId(projects, id);
    },
    addNotificationComment: function(comment, id){
    	var not = getNotificationById(projs, id);
    	var comm = {};
    	comm = comment;
    	comm.from = 1;
    	not.comments.push(comm);
    },
    changeNotificationStatus: function (status,id){
    	var not = getNotificationById(projs, id);
    	not.status = status;
    }
  };
});




/*
*    FUNCIONES AUXILIARES
*/

function getProjectByNotificationId (projects,id){
	var enc = false;
	var proj = null;
	var i = 0;
	while (!enc && i < projects.length){
		var nots = projects[i].notifications;
		var j = 0;
		while (!enc && j < nots.length){
			if(nots[j].id == id){
				enc = true;
				proj =  projects[i];
			};
			j++;
		};
		i++;
	};
	return proj;
};

function getProjectById(projects,id){
	var enc = false;
	var proj = [];
	var i = 0;
	while (!enc && i < projects.length){
		if(projects[i].id == id){
			proj = projects[i];
			enc = true;
		};
		i++;
	};
	return proj;
};


function getNotificationById (projects,id){
	var enc = false;
	var not = null;
	var i = 0;
	while (!enc && i < projects.length){
		var nots = projects[i].notifications;
		var j = 0;
		while (!enc && j < nots.length){
			if(nots[j].id == id){
				enc = true;
				not =  nots[j];
			};
			j++;
		};
		i++;
	};
	return not;
};

function getNotificationsByProjectId(projects, id){
	var enc = false;
	var nots = [];
	var i = 0;
	while (!enc && i < projects.length){
		if(projects[i].id == id){
			nots = projects[i].notifications;
			enc = true;
		};
		i++;
	};
	return nots;
};