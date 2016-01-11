angular.module('supportTool').
directive('supportNotifications', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/notifications/notifications.html'
	};
}).
directive('supportNavNotification', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/notifications/notificaciones-nav.html'
	};
});