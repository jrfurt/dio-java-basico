package com.estudos.aula8.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equals(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int getTotalTarefas() {
		return tarefaList.size();
	}
	
	public void getDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa lista = new ListaTarefa();
		
		System.out.println("Total de elementos: " + lista.getTotalTarefas());
		lista.adicionarTarefa("Tarefa 1");
		lista.adicionarTarefa("Tarefa 1");
		lista.adicionarTarefa("Tarefa 2");
		System.out.println("Total de elementos: " + lista.getTotalTarefas());
		lista.removerTarefa("Tarefa 2");
		System.out.println("Total de elementos: " + lista.getTotalTarefas());
		lista.getDescricaoTarefas();
	}
}
