var ulacitControllers = angular.module('ulacitControllers', [ 'mgcrea.ngStrap' ]);

ulacitControllers.controller('foodsController', [ '$scope', 'UlacitService',
		function($scope, UlacitService) {
			$scope.data = {};

			UlacitService.getAllFoods(function(error, data) {
				if (!error) {
					$scope.data.food = data;
				}
			});

ulacitControllers.controller('loginController', [ '$scope', 'UlacitService',
		function($scope, UlacitService) {
			$scope.data = {};

			UlacitService.getAllUsers(function(error, data) {
				if (!error) {
					$scope.data.users = data;
				}
			});

ulacitControllers.controller('employeesController', [ '$scope', 'UlacitService',
		function($scope, UlacitService) {
			$scope.data = {};

			UlacitService.getAllEmployees(function(error, data) {
				if (!error) {
					$scope.data.employees = data;
				}
			});

		} ]);
