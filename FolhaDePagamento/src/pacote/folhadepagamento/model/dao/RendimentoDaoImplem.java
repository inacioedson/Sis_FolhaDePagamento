package pacote.folhadepagamento.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pacote.folhadepagamento.model.model.RendimentosModel;

public class RendimentoDaoImplem implements RendimentoDaoInterface{
	
	@PersistenceContext(unitName="FolhaDePagamentoPersistenceUnit")
	private EntityManager entityManager;
	

	@Override
	public RendimentosModel salvarRendimento(RendimentosModel rendimentosModel) {
		entityManager.persist(rendimentosModel);
		return rendimentosModel;
	}

	@Override
	public void alterar(RendimentosModel rendimentosModel) {
		RendimentosModel rendimentosModelMerge = entityManager.merge(rendimentosModel);
		entityManager.persist(rendimentosModelMerge);
	}

	@Override
	public void excluir(RendimentosModel rendimentosModel) {
		RendimentosModel rendimentosModelMerge = entityManager.merge(rendimentosModel);
		entityManager.remove(rendimentosModelMerge);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<RendimentosModel> getRendimentos() {
		Query query = entityManager.createQuery("from RendimentosModel");
		
		return query.getResultList();
	}

}
