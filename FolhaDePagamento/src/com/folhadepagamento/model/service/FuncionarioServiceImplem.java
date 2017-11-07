package com.folhadepagamento.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pacote.folhadepagamento.model.dao.FuncionarioDaoInterface;
import pacote.folhadepagamento.model.model.FuncionariosModel;

public class FuncionarioServiceImplem implements FuncionarioServiceInterface{
	
	@Inject
	private FuncionarioDaoInterface funcionarioDaoInterface;
	
	@Override
	public List<FuncionariosModel> getFuncionarios() {
		return funcionarioDaoInterface.getFuncionarios();
	}

	@Override
	@Transactional
	public FuncionariosModel salvarFuncionario(FuncionariosModel funcionariosModel) {
		return funcionarioDaoInterface.salvarFuncionario(funcionariosModel);
	}

	@Override
	@Transactional
	public void alterar(FuncionariosModel funcionariosModel) {
		funcionarioDaoInterface.alterar(funcionariosModel);
	}

	@Override
	@Transactional
	public void excluir(FuncionariosModel funcionariosModel) {
		funcionarioDaoInterface.excluir(funcionariosModel);
	}

}
