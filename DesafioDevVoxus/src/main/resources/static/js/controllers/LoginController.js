'use strict';

(function() {

	angular.module('app')
			.controller('LoginController', LoginController);
	LoginController.$inject = [ '$scope', '$timeout', '$location','$window','$rootScope'];
	function LoginController($scope, $timeout, $location, $window,$rootScope) {

		var vm = this;
		
		

		
		
		function onSignIn(googleUser) {
			  $rootScope.profile = googleUser.getBasicProfile();
			  console.log('ID: ' + $rootScope.profile.getId()); // Do not send to your backend! Use an ID token instead.
			  console.log('Name: ' + $rootScope.profile.getName());
			  console.log('Image URL: ' + $rootScope.profile.getImageUrl());
			  console.log('Email: ' + $rootScope.profile.getEmail()); // This is null if the 'email' scope is not present.
			  console.log('profile',$rootScope.profile);
			  localStorage.setItem('firstName', $rootScope.profile.ofa);
			  localStorage.setItem('fullName', $rootScope.profile.ig);
			  redirecionar();
			  
			}
		
		function redirecionar(){
			console.log("chegou"); 
			$window.location.assign("/voxus/home");
			 
		}
		
		window.onSignIn = onSignIn;
	};
})();