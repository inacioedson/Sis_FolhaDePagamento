package com.folhadepagamento.model.service;

import java.util.List;

import pacote.folhadepagamento.model.model.FuncionariosModel;

public interface FuncionarioServiceInterface {
FuncionariosModel salvarFuncionario(FuncionariosModel funcionariosModel);
	
	void alterar(FuncionariosModel funcionariosModel);
	
	void excluir(FuncionariosModel funcionariosModel);
	
	List<FuncionariosModel> getFuncionarios();
}
