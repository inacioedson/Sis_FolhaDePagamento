var pagamentosModulo = angular.module('pagamentosModulo',[]);

pagamentosModulo.controller("pagamentosController", function ($scope){
	
	$scope.funcionarios = [
							{codigo: 1, nome: 'Edson Inácio Batista', cpf:'990.952.381-72'}, 
							{codigo: 2, nome: 'João Clever Pereira', cpf: '880.651.321-94'},
							{codigo: 3, nome: 'Roberto Sampaio Correia', cpf: '754.365.265-95'},
							{codigo: 4, nome: 'Maria do Carmo Naves', cpf: '784.365.269-65'},
	];
	
	$scope.pagamentos = [
							{salarioBase: '1.500,00', gratificacao: '90,00', liquido: '120,00', 
								funcionario:{codigo: 1, nome: 'Edson Inácio Batista', cpf:'990.952.381-72'}},
							{salarioBase: '950,00', gratificacao: '50,00', liquido: '500,00', 
								funcionario:{codigo: 2, nome: 'João Clever Pereira', cpf: '880.651.321-94'}},
							{salarioBase: '2.500,00', gratificacao: '75,00', liquido: '1.200,00', 
								funcionario:{codigo: 3, nome: 'Roberto Sampaio Correia', cpf: '754.365.265-95'}},
							{salarioBase: '1.500,00', gratificacao: '50,00', liquido: '120,00', 
								funcionario:{codigo: 4, nome: 'Maria do Carmo Naves', cpf: '784.365.269-65'}},
	];

	$scope.selecionaPagamento = function(pagamentoselecionado){
		$scope.pagamento = pagamentoselecionado;
	}

	/*$scope.limparCampos = function(){
		$scope.pagamento = "";
	}

	$scope.salvar = function(){
		$scope.pagamentos.push($scope.pagamento);
		$scope.limparCampos();
	}

	$scope.excluir = function(){
		$scope.pagamentos.splice($scope.pagamentos.indexOf($scope.pagamento), 1);
		$scope.limparCampos();
	}*/

});