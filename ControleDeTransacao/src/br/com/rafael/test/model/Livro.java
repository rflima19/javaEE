package br.com.rafael.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro implements Serializable {

	@Id
	//@GeneratedValue
	@Column(name = "livro_id", nullable = false)
	private Integer id;

	@Column(name = "titulo", length = 200, nullable = false)
	private String titulo;

	@Column(name = "num_paginas", nullable = false)
	private Integer numeroPaginas;

	public Livro() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
