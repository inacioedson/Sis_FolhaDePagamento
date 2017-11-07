package com.folhadepagamento.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pacote.folhadepagamento.model.model.FuncionariosModel;
import pacote.folhadepagamento.model.model.RendimentosModel;
import pacote.folhadepagamento.model.model.CalculaSalarioModel;

@Path("/pagamentos")
@Produces({MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)

public class CalculaSalarioRestFacade {
	
	static List<CalculaSalarioModel> listaDeCalculos = new ArrayList<CalculaSalarioModel>();

	
	static{
		listaDeCalculos.add(new CalculaSalarioModel(800.00, new FuncionariosModel(1, "Edson Inácio", "990.952.381-72"), new RendimentosModel(1, "Agosto", 1500.00, 6.0, 8.0, 80.00, 92.00, 45.00, null)));
		listaDeCalculos.add(new CalculaSalarioModel(1000.00, new FuncionariosModel(1, "Zico", "990.952.381-72"), new RendimentosModel(1, "Agosto", 2000.00, 7.0, 8.0, 90.00, 100.00, 54.00, null)));

	}
	
	@GET
	public List<CalculaSalarioModel> getCalcularSalario(){
		return listaDeCalculos;
	}

}
