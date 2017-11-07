package pacote.folhadepagamento.model.dao;

import java.util.List;

import pacote.folhadepagamento.model.model.RendimentosModel;

public interface RendimentoDaoInterface {
	RendimentosModel salvarRendimento(RendimentosModel rendimentosModel);
	
	void alterar(RendimentosModel rendimentosModel);
	
	void excluir(RendimentosModel rendimentosModel);
	
	List<RendimentosModel> getRendimentos();

}
