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

import com.folhadepagamento.model.service.FuncionarioServiceInterface;

import pacote.folhadepagamento.model.model.FuncionariosModel;

@Path("/funcionarios")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)	

public class FuncionariosRestFacade{
	
	/* Direto, sem o uso do serviço.
	@Inject
	private FuncionarioDaoImplem funcionarioDaoImplem;
	
	@GET
	public List<FuncionariosModel> getFuncionarios(){
		return funcionarioDaoImplem.getFuncionarios();
	}*/
	
	@Inject
	private FuncionarioServiceInterface funcionarioServiceInterface;
	
	@GET
	public List<FuncionariosModel> getFuncionarios(){
		return funcionarioServiceInterface.getFuncionarios();
	}
	
	@POST
	public FuncionariosModel salvarFuncionario(FuncionariosModel funcionariosModel){
		return funcionarioServiceInterface.salvarFuncionario(funcionariosModel);
	}
	
	@PUT
	public void atualizar(FuncionariosModel funcionariosModel){
		funcionarioServiceInterface.alterar(funcionariosModel);
	}
	
	@DELETE
	@Path("/{codigoFuncionario}")
	public void excluir(@PathParam("codigoFuncionario") Integer codigoFuncionario){
		FuncionariosModel funcionariosModel = new FuncionariosModel();
		funcionariosModel.setCodigo(codigoFuncionario);
		funcionarioServiceInterface.excluir(funcionariosModel);
	}
}





















