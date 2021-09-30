package br.org.generation.minha.loja.de.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity // Esta classe vai ser uma entidade de JPA
@Table(name ="tb_produto") // Criação da tabela
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message =" O atributo nome é obrigatório!")
	@Size(min = 3, max = 100, message = "O Atributo nome deve ter no mínimo 3 e no máximo 100 caracteres!")
	private String nome;
	
	@NotNull(message =" O atributo valor é obrigatório!")
	private double valor;
	
	@NotNull(message =" O atributo descrição é obrigatório!")
	@Size(min = 3, max = 100, message = "O Atributo descrição deve ter no mínimo 3 e no máximo 100 caracteres!")
	private String descricao;

	@ManyToOne // tipo de relação que esta classe vai ter com a outra classe
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
