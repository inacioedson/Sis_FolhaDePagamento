package pacote.folhadepagamento.model.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalculaSalarioModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	Double salarioLiquido;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rendimentosModel == null) ? 0 : rendimentosModel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalculaSalarioModel other = (CalculaSalarioModel) obj;
		if (rendimentosModel == null) {
			if (other.rendimentosModel != null)
				return false;
		} else if (!rendimentosModel.equals(other.rendimentosModel))
			return false;
		return true;
	}

	public CalculaSalarioModel(){
		
	}
	
	FuncionariosModel funcionariosModel;
	RendimentosModel rendimentosModel;	
	
	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public RendimentosModel getRendimentosModel() {
		return rendimentosModel;
	}

	public void setRendimentosModel(RendimentosModel rendimentosModel) {
		this.rendimentosModel = rendimentosModel;
	}

	public FuncionariosModel getFuncionariosModel() {
		return funcionariosModel;
	}

	public void setFuncionariosModel(FuncionariosModel funcionariosModel) {
		this.funcionariosModel = funcionariosModel;
	}

	public double salarioLiquido(){
		salarioLiquido = rendimentosModel.getSalarioBase() + rendimentosModel.getGratificacao();
		return salarioLiquido;
	}

	public CalculaSalarioModel(Double salarioLiquido, FuncionariosModel funcionariosModel, RendimentosModel rendimentosModel) {
		this.salarioLiquido = salarioLiquido;
		this.funcionariosModel = funcionariosModel;
		this.rendimentosModel = rendimentosModel;
	}
	
}
