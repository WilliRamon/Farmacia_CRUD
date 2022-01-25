package br.com.Uana.farmacia.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_Categorias")
public class Categoria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O tipo não aceita campos vazios!") 
	@Size(min = 5, max = 60, message = "O tipo deve conter no mínimo 05 e no máximo 60 caracteres")
	private String descricao; 
	
	@NotBlank(message = "true or false e não aceita campos vazios")
	private boolean generico;
	
	@NotBlank(message = "Escolha o setor A, B ou C ! E não eaceita campos vazios")
	private enum setor { A,B,C }
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	//Métodos Geters e Seters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}; 


	
	
}
