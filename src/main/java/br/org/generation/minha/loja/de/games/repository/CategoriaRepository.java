package br.org.generation.minha.loja.de.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.generation.minha.loja.de.games.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByGrupoContainingIgnoreCase( String grupo);
	
	

}
