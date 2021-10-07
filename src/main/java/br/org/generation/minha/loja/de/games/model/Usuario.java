package br.org.generation.minha.loja.de.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O atributo Nome é Obrigatório!")
	private String nome;
	
	@NotNull(message = "O atributo Usuario(Email) é Obrigatório!")
	private String usuario; // e-mail
	
	
	@NotNull(message = "O atributo Senha é Obrigatório!")
	@Size(min=6) // não colocar o max, se não da problema na hora da criptgrafia da senha.
	private String senha;
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.REMOVE)	//CascadeType de ALL para REMOVE
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
	
	
	

	// Criação dos métodos
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	

}
