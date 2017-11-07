package pacote.folhadepagamento.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pacote.folhadepagamento.model.model.FuncionariosModel;

public class FuncionarioDaoImplem implements FuncionarioDaoInterface{
	
	@PersistenceContext(unitName="FolhaDePagamentoPersistenceUnit")
	private EntityManager entityManager;
	

	@Override
	public FuncionariosModel salvarFuncionario(FuncionariosModel funcionariosModel) {
		entityManager.persist(funcionariosModel);
		return funcionariosModel;
	}

	@Override
	public void alterar(FuncionariosModel funcionariosModel) {
		FuncionariosModel funcionariosModelMerge = entityManager.merge(funcionariosModel);
		entityManager.persist(funcionariosModelMerge);
	}

	@Override
	public void excluir(FuncionariosModel funcionariosModel) {
		FuncionariosModel funcionariosModelMerge = entityManager.merge(funcionariosModel);
		entityManager.remove(funcionariosModelMerge);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<FuncionariosModel> getFuncionarios() {
		Query query = entityManager.createQuery("from FuncionariosModel");
		
		return query.getResultList();
	}

}
