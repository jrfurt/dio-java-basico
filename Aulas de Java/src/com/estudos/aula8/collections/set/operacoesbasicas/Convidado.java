package com.estudos.aula8.collections.set.operacoesbasicas;

public class Convidado {
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	@Override
	public String toString() {
		return "{ nome: " + nome 
			+ ", codigoConvite: " + codigoConvite 
			+ " }";
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	public String getNome() {
		return nome;
	}
}
