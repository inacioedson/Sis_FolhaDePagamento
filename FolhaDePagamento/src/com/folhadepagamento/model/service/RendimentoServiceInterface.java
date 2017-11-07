package com.folhadepagamento.model.service;

import java.util.List;

import pacote.folhadepagamento.model.model.RendimentosModel;

public interface RendimentoServiceInterface {
RendimentosModel salvarRendimento(RendimentosModel rendimentosModel);
	
	void alterar(RendimentosModel rendimentosModel);
	
	void excluir(RendimentosModel rendimentosModel);
	
	List<RendimentosModel> getRendimentos();
}
