package pacote.folhadepagamento.model.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="funcionario")
public class FuncionariosModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="func_codigo")
	Integer codigo;
	@Column(name="func_nome", length=30, nullable=false)
	String nome;
	@Column(name="func_cpf", length=11, nullable=false)
	String cpf;
	
	//o código aqui dentro talvez não precise ####
	@OneToMany(mappedBy="funcionariosModel")
	private List<RendimentosModel> rendimentosModel;
	
	@XmlTransient
	public List<RendimentosModel> getRendimentos(){
		return rendimentosModel;
	}
	
	//public List<RendimentosModel> getRendimentosModel() {
		//return rendimentosModel;
	//}

	public void setRendimentosModel(List<RendimentosModel> rendimentosModel) {
		this.rendimentosModel = rendimentosModel;
	}
	//o código aqui dentro talvez não precise ####

	public FuncionariosModel(){
		
	}

	public FuncionariosModel(Integer codigo, String nome, String cpf) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		FuncionariosModel other = (FuncionariosModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
