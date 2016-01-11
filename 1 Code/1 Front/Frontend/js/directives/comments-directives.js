angular.module('supportTool').
directive('supportComments', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/comments/comments.html'
	};
}).
directive('supportNavNotificationComment', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/comments/comments-nav.html'
	};
});