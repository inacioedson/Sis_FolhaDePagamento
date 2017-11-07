package com.folhadepagamento.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pacote.folhadepagamento.model.dao.RendimentoDaoInterface;
import pacote.folhadepagamento.model.model.RendimentosModel;

public class RendimentoServiceImplem implements RendimentoServiceInterface{
	
	@Inject
	private RendimentoDaoInterface rendimentoDaoInterface;
	
	@Override
	public List<RendimentosModel> getRendimentos() {
		return rendimentoDaoInterface.getRendimentos();
	}

	@Override
	@Transactional
	public RendimentosModel salvarRendimento(RendimentosModel rendimentosModel) {
		return rendimentoDaoInterface.salvarRendimento(rendimentosModel);
	}

	@Override
	@Transactional
	public void alterar(RendimentosModel rendimentosModel) {
		rendimentoDaoInterface.alterar(rendimentosModel);
	}

	@Override
	@Transactional
	public void excluir(RendimentosModel rendimentosModel) {
		rendimentoDaoInterface.excluir(rendimentosModel);
	}

}
