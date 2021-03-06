package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity //define entidade do JPA
@Table(name = "postagem") //esta entidade será uma tabela na DB, definindo o nome da tabela
public class Postagem {
	
	@Id //definindo atributo como id na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //"gerado automaticamente , chave-primaria"
	private long id;
	
	@NotNull
	@Size(min=5, max=100)
	private String titulo;
	
	@NotNull
	@Size(min=10, max=500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis()); //determinando data do momento da postagem
	
	@ManyToOne //estabelecando tipo de relacionamento
	@JsonIgnoreProperties("postagem") //ignora as propriedades quando chegar no atributo "postagem" - evita recursividade
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Tema getTema() {
		return tema;
	}
	
	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
