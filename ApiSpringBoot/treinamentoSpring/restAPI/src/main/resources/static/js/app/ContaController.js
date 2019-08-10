'use strict'
var module = angular.module('demo.controllers', []);
module.controller("ContaController", ["$scope", "ContaService",
    function($scope, ContaService) {
	$scope.contaDto = {
			contaId : null,
			descricao : null,
			mes : null,
			tipoConta:null,
			statusConta:null,
			valor:null,
			parcela:null,	
            skillDtos: []

        };
        $scope.skills = [];
        

		ContaService.getContaById(1).then(function(value) {
			console.log(value.data);
		}, function(reason) {
			console.log("error occured");
		}, function(value) {
			console.log("no callback");
		});
   
        
        $scope.saveConta = function() {
            $scope.contaDto.parcelasDto = $scope.skills.map(skill => {
                return {
                    parcelaId: null,
                    valor: skill
                };
            });
            ContaService.saveConta($scope.contaDto).then(function() {
				console.log("works");
				ContaService.getAllContas().then(function(value) {
					$scope.allContas= value.data;
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
				
                $scope.skills = [];
                $scope.contaDto = {
						contaId : null,
						descricao : null,
						mes : null,
						tipoConta:null,
						statusConta:null,
						valor:null,
						parcela:null,
			            skillDtos: []
                };
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }
    }
]);