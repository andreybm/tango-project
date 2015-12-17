var dicApp = angular.module('dicApp', [
  'ngRoute',
  'ulacitControllers',
  'ulacitServices'
]);

dicApp.config(['$routeProvider',
  function ($routeProvider) {
      $routeProvider.
        when('/login', {
            templateUrl: 'app/views/login.html',
            controller: 'loginController'
        }).
         when('/foods', {
            templateUrl: 'app/views/food.html',
            controller: 'foodController'
        }).
          when('/employees', {
            templateUrl: 'app/views/employee.html',
            controller: 'employeeController'
        }).
        otherwise({
            redirectTo: '/login'
        });
  }]);