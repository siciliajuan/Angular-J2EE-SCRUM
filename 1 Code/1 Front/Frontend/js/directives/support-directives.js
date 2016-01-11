angular.module('supportTool').
directive('supportSupport', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/support/sup.html',
		controller: "projectsController"
	};
}).
directive('supportSupportNav', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/support/sup-nav.html',
		controller: "projectsController"
	};
});