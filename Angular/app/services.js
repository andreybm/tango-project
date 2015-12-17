var ulacitServices = angular.module('ulacitServices', [ 'ngResource' ]);
ulacitServices
		.factory(
				'UlacitService',
				function($http) {
					var serviceAppFuseURL = 'http://localhost:8080/services/api/foods';
					return {
						
						getAllFoods : function(callback) {
							$http.get(serviceAppFuseURL).success(function(data) {
								callback(null, data);
							}).error(function(e) {
								callback(e);
							});
						}
					}
				});

ulacitServices.factory('StorageService', function StorageService($window) {
	return {
		get : function(key) {
			var data = angular.fromJson($window.sessionStorage.getItem(key));

			return data;
		},

		save : function(key, dataToSave) {
			var dataToSaveInJson = angular.toJson(dataToSave);

			return $window.sessionStorage.setItem(key, dataToSaveInJson);
		},

		remove : function(key) {
			return $window.sessionStorage.removeItem(key);
		},

		clear : function() {
			$window.sessionStorage.clear();
		}
	}
});