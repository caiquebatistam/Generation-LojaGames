package br.org.generation.minha.loja.de.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity // Esta classe vai ser uma entidade de JPA
@Table(name ="tb_categoria") // Criação da tabela
public class Categoria {
	
	// Criação dos Atributos
	
	@Id // Chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Equivalente ao Auto_increment do MySQL
	private long id_categoria;
	
	@NotNull(message =" O atributo grupo é obrigatório!")
	@Size(min = 3, max = 100, message = "O Atributo grupo deve ter no mínimo 3 e no máximo 100 caracteres!")
	private String grupo;
	
	@OneToMany(mappedBy = "categoria")
	@JsonIgnoreProperties("categoria")
	private List<Produto> produtos;
	
	
	// Métodos
	
	public long getId() {
		return id_categoria;
	}
	public void setId(long id) {
		this.id_categoria = id;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
 
	public long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	

}
