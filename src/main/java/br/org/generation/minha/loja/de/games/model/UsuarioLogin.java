package br.org.generation.minha.loja.de.games.model;

/*Esta classe serve como molde para fazer o login, enviando os dados
 * para a Secutiry fazer o Login (Autenticação)
 */

public class UsuarioLogin {
	
	// atributos
	
	private long id;
	private String nome;
	private String usuario;
	private String senha;
	private String token;
	
	// métodos
	
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
	

}
