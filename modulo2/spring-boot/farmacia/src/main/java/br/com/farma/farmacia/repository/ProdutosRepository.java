package br.com.farma.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farma.farmacia.model.Produto;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{ //classe e tipo do id ("chave primaria")
	
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
