package com.estudos.aula8.collections.list.operacoesbasicas;

public class Tarefa {
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
