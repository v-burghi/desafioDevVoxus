'use strict';

(function() {

	angular.module('app')
			.controller('TarefaController', TarefaController);
	TarefaController.$inject = [ '$scope', '$timeout', '$http','$rootScope'];
	function TarefaController($scope, $timeout, $http,$rootScope) {

		var vm = this;
		vm.tarefas = [];
		vm.nomeTarefa="";
		vm.descTarefa="";
		vm.prioridade="";
		vm.sucesso = false;
		vm.erro = false;
		vm.gravarTarefa = gravarTarefa;
		vm.tarefaMontada={};
		vm.excluirTarefa = excluirTarefa;
		vm.carregarTarefa = carregarTarefa;
		vm.concluirTarefa = concluirTarefa;
		vm.firstName = localStorage.getItem("firstName");
		
		carregarTarefa();
		
		
		
		
		console.log($rootScope.profile);
	
		
		
		function carregarTarefa(){
			$http({
			method: 'GET',
			url: '/tarefa/tarefas'
			}).then(function(response){
				
				vm.tarefas = response.data;
				
			}, function(response){
				
			});
		}
		
		function gravarTarefa(){
			console.log(vm.tarefa)
			vm.tarefa.usuarioCriador = localStorage.getItem("fullName");
			$http({
				method:"POST",
				url: '/tarefa/gravartarefa',
				data: vm.tarefa
			}).then(function(response){
				limparCampos();
				vm.sucesso = true;
			})
		}
		
		function limparCampos(){
			
		}
		
		function excluirTarefa(tarefa){
			$http({
				method:"DELETE",
				url:'/tarefa/deletartarefa/' + tarefa.idTarefa,
			}).then(function(response){
				console.log("deletado", response);
				carregarTarefa();
			})
		}
		
		function concluirTarefa(tarefa){
			console.log(tarefa);
			tarefa.concluida=true;
			console.log(localStorage.getItem("fullName"));
			tarefa.usuarioFinalizador = localStorage.getItem("fullName");
			$http({
				method:"PUT",
				url:'/tarefa/atualizartarefa/' + tarefa.idTarefa,
				data: tarefa
			}).then(function(response){
				console.log("atualizado", response);
				carregarTarefa();
			})
		}
		
		//quando implementar o logout, limpar o localStorage com localStorage.clear();
		
	};
})();