package br.org.generation.minha.loja.de.games.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.org.generation.minha.loja.de.games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase( String nome);

	
}