package com.estudos.aula8.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> setConvidados;
	
	public ConjuntoConvidados() {
		setConvidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		setConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		
		for (Convidado c : setConvidados) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		
		setConvidados.remove(convidadoParaRemover);
	}
	
	public int contaConvidados() {
		return setConvidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(setConvidados);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjunto = new ConjuntoConvidados();
		
		conjunto.adicionarConvidado("Allef", 110);
		conjunto.adicionarConvidado("Lazaro", 111);
		conjunto.adicionarConvidado("Luis", 112);
		
		conjunto.exibirConvidados();
		System.out.println("Nº de convidados: " + conjunto.contaConvidados());
		
		conjunto.removerConvidadoPorCodigoConvite(112);
		conjunto.exibirConvidados();
	}
}
