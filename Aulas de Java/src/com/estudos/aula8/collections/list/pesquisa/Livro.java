package com.estudos.aula8.collections.list.pesquisa;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return "{ Título: " + titulo
			+ ", Autor: " + autor
			+ ", Ano de Publicação: " + anoPublicacao
			+ " }";
	}
}
