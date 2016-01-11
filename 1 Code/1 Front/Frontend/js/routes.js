angular.module('supportTool').
config(['$routeProvider',function($routeProvider) {
	$routeProvider.
		when('/support',{
			templateUrl: './templates/pages/support/index.html'
		}).
		when('/support/notifications/:id',{
			templateUrl: './templates/pages/notifications/index.html',
			controller: 'NotificationsController',
			controllerAs: 'notsCtrl'
		}).
		when('/support/notifications/comments/:id',{
			templateUrl: './templates/pages/comments/index.html',
			controller: "CommentsController",
			controllerAs: "commentsCtrl"
		}).
		when('/support/notifications/change-status/:id',{
			templateUrl: './templates/pages/change-status/index.html',
			controller: "StatusController",
			controllerAs: "changeCtrl"
		}).
		otherwise({
			redirectTo: '/support'
		});
}]);