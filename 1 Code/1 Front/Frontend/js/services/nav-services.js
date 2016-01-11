angular.module('supportTool').
factory('Nav', function NavFactory(){
  var projAct;
  var notAct;
  var projName;
  return {
    setProject: function(newProj) { 
    	projAct = newProj;
    },
    getProject: function() { 
    	return projAct;
    },
    setNotification: function(newNot) { 
    	notAct = newNot;
    },
    getNotification: function() { 
    	return notAct;
    },
    setProjName: function(newName) {
      projName = newName;
    },
    getProjName: function() {
      return projName;
    }
  };
});