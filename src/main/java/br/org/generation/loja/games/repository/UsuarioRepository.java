package br.org.generation.loja.games.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.loja.games.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	//select * from tb_usuarios where ususario = "xxx";

	
	//Método criado para a Sessão de testes 01
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	//Método criado para a Sessão de testes 02
	public Usuario findByNome(String nome);
	
	
}