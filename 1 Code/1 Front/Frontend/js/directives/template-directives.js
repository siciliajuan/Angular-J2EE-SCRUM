angular.module('supportTool').
directive('supportHeader', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/header.html'
	};
}).
directive('supportFooter', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/footer.html'
	};
});