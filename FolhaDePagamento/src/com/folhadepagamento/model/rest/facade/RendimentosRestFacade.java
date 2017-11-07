package com.folhadepagamento.model.rest.facade;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.folhadepagamento.model.service.RendimentoServiceInterface;

import pacote.folhadepagamento.model.model.RendimentosModel;

@Path("/rendimentos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)	

public class RendimentosRestFacade{
	
	/* Direto, sem o uso do serviço.
	@Inject
	private RendimentoDaoImplem rendimentoDaoImplem;
	
	@GET
	public List<RendimentosModel> getRendimentos(){
		return rendimentoDaoImplem.getRendimentos();
	}*/
	
	@Inject
	private RendimentoServiceInterface rendimentoServiceInterface;
	
	@GET
	public List<RendimentosModel> getRendimentos(){
		return rendimentoServiceInterface.getRendimentos();
	}
	
	@POST
	public RendimentosModel salvarRendimento(RendimentosModel rendimentosModel){
		return rendimentoServiceInterface.salvarRendimento(rendimentosModel);
	}
	
	@PUT
	public void atualizar(RendimentosModel rendimentosModel){
		rendimentoServiceInterface.alterar(rendimentosModel);
	}
	
	@DELETE
	@Path("/{codigoRendimento}")
	public void excluir(@PathParam("codigoRendimento") Integer codigoRendimento){
		RendimentosModel rendimentosModel = new RendimentosModel();
		rendimentosModel.setCodigo(codigoRendimento);
		rendimentoServiceInterface.excluir(rendimentosModel);
	}
}





















