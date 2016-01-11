angular.module('supportTool').
directive('supportChangeStatus', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/change-status/change_status.html',
		link: function (){
			$("#submit").on("click",function(){
				if (!$("textarea").val()) {
    				$("#textarea-form .error").removeClass("hidden");
    				$("textarea").addClass("border-error");
				};
				if ($("#select-form select").val() == "? undefined:undefined ?"){
					$("#select-form .error").removeClass("hidden");
					$("select").addClass("border-error");
				}
			});
			$("textarea").on("keyup",function(){
				if ($("textarea").val()) {
					$("#textarea-form .error").addClass("hidden");
    				$("textarea").removeClass("border-error");
				};
				if (!$("textarea").val()) {
    				$("#textarea-form .error").removeClass("hidden");
    				$("textarea").addClass("border-error");
				};
			});
			$("textarea").on("focusout",function(){
				if (!$("textarea").val()) {
    				$("#textarea-form .error").removeClass("hidden");
    				$("textarea").addClass("border-error");
				};
			});
			$("select").focusout(function(){
				if ($("#select-form select").val() == "? undefined:undefined ?"){
					$("#select-form .error").removeClass("hidden");
					$("select").addClass("border-error");
				};
			});
			$("select").mouseleave(function(){
				if ($("#select-form select").val() != "? undefined:undefined ?"){
					$("#select-form .error").addClass("hidden");
					$("select").removeClass("border-error");
				};
			});
		}
	};
}).
directive('supportNavNotificationStatus', function(){
	return {
		restrict: 'E',
		templateUrl: './templates/pages/change-status/change-status-nav.html'
	};
});