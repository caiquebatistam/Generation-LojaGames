package br.org.generation.minha.loja.de.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.minha.loja.de.games.model.Categoria;
import br.org.generation.minha.loja.de.games.repository.CategoriaRepository;


@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired //
	private CategoriaRepository categoriaRepository; // -> inst variavel
	
	@GetMapping
	public ResponseEntity <List<Categoria>> getAll()// Entidade de Resposta
	{     // injeção de dependencia
		return ResponseEntity.ok(categoriaRepository.findAll()); // equivalente ao MySQL select * from tb_postagens
	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id) 
	{
	  	return categoriaRepository.findById(id)
	  		.map(resposta -> ResponseEntity.ok(resposta))
	  		.orElse(ResponseEntity.notFound().build());
	}
	

	@GetMapping("/grupo/{grupo}")
	public ResponseEntity<List<Categoria>> getByTitulo(@PathVariable String grupo)
	{
		return ResponseEntity.ok(categoriaRepository.findAllByGrupoContainingIgnoreCase(grupo));
	}	

	@PostMapping
	public ResponseEntity<Categoria> postCategoria (@RequestBody Categoria grupo)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(grupo));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria (@RequestBody Categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
	}	

	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) 
	{
		categoriaRepository.deleteById(id);
	}
	
	
}
