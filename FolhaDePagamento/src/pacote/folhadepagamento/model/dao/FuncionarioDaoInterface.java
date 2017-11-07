package pacote.folhadepagamento.model.dao;

import java.util.List;

import pacote.folhadepagamento.model.model.FuncionariosModel;

public interface FuncionarioDaoInterface {
	
	FuncionariosModel salvarFuncionario(FuncionariosModel funcionariosModel);
	
	void alterar(FuncionariosModel funcionariosModel);
	
	void excluir(FuncionariosModel funcionariosModel);
	
	List<FuncionariosModel> getFuncionarios();

}
