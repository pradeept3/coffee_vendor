'use strict'

var module = angular.module('demo.controllers', []);
module.controller("CoffeeController", [ "$scope", "CoffeeService",
		function($scope, CoffeeService) {

			$scope.coffeeDto = {
				coffeeId : null,
				coffeeName : null,
				productDtos : []
			};
			$scope.products = [];
			
			CoffeeService.getCoffeeById(1).then(function(value) {
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			$scope.saveCoffee = function() {
				$scope.coffeeDto.productDtos = $scope.products.map(product => {
					return {productId: null, productName: product};
				});
				CoffeeService.saveCoffee($scope.coffeeDto).then(function() {
					console.log("works");
					coffeeService.getAllCoffees().then(function(value) {
						$scope.allCoffees= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.products = [];
					$scope.coffeeDto = {
						coffeeId : null,
						coffeeName : null,
						productDtos : []
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);