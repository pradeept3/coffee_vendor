'use strict'

angular.module('coffeevendor.services', []).factory('CoffeeService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getCoffeeById = function(coffeeId) {
				var url = CONSTANTS.getCoffeeByIdUrl + coffeeId;
				return $http.get(url);
			}
			service.getAllCoffees = function() {
				return $http.get(CONSTANTS.getAllCoffees);
			}
			service.saveCoffee = function(CoffeeDto) {
				return $http.post(CONSTANTS.saveCoffee, coffeeDto);
			}
			return service;
		} ]);