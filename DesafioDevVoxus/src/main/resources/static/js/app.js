angular.module('app', [ 'ngRoute', 'ngCookies', 'ngMessages', 'ngAnimate' ]);

angular.module('app').config(function($routeProvider, $locationProvider) {

	$routeProvider.when('/voxus/novatarefa', {
		templateUrl : '/partials/novatarefa.html',
		controller : 'TarefaController',
		controllerAs : 'vm'
	});
	$routeProvider.when('/voxus/home', {
		templateUrl : '/partials/home.html',
		controller : 'TarefaController',
		controllerAs : 'vm'
	});
	$routeProvider.when('/voxus', {
		templateUrl : '/partials/login.html',
		controller : 'LoginController',
		controllerAs : 'vm'
	});
	$routeProvider.otherwise({
		redirectTo : '/voxus'
	});
	$locationProvider.html5Mode({
		enabled : true,
		requireBase : false
	});
});