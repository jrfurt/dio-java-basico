package com.estudos.aula8.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	List<Livro> livroList;

	public CatalogoLivros() {
		livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}

		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}

		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}

		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();

		catalogo.adicionarLivro("Julio Cesar", "Julio", 2016);
		catalogo.adicionarLivro("Meus afazeres", "Julio", 2018);
		catalogo.adicionarLivro("Joao e Jose", "Joao", 2015);
		catalogo.adicionarLivro("Juristinga", "Reizin", 2013);
		System.out.println(catalogo.pesquisarPorAutor("Julio"));
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2013, 2015));
		System.out.println(catalogo.pesquisarPorTitulo("meus afazeres"));
	}
}
