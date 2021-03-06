package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
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

@RestController //define classe controller
@RequestMapping("/postagens") //define endpoint que vai chamar esta API
@CrossOrigin("*") //define aceitação de requisições de qualquer origem
public class PostagensController {
	
	@Autowired //injeção de dependências do Spring
	private PostagemRepository repository; //pegando classe repository

	@GetMapping
	public ResponseEntity <List<Postagem>> GetAll(){ //retorna um List do Tipo postagem
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //define parâmetro enviado pela requisição
	public ResponseEntity<Postagem> GetById(@PathVariable long id){ //anotação define que o parâmetro será passado na uri
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem){ //pega parâmetro pelo corpo da requisição
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem){ //atualiza deterinada postagem
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		repository.deleteById(id); //deleta uma entidade com determinado id
	}
}
