'use strict'

angular.module('demo.services', []).factory('ContaService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getContaById = function(contaId) {
				var url = CONSTANTS.getContaByIdUrl + contaId;
				return $http.get(url);
			}
			service.getAllContas = function() {
				return $http.get(CONSTANTS.getAllContas);
			}
			service.saveConta = function(contaDto) {
				return $http.post(CONSTANTS.saveConta, contaDto);
			}
			return service;
		} ]);