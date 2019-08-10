'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getContaByIdUrl : "/conta/getConta/",
	getAllContas : "/conta/getAllContas",
	saveConta : "/conta/saveConta"
	
});