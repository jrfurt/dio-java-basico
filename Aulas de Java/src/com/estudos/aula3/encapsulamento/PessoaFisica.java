package com.estudos.aula3.encapsulamento;

public class PessoaFisica {
	String nome;
	String cpf;
	
	public PessoaFisica(String cpf) {
		if (validaCpf(cpf)) {
			this.cpf = cpf;
		} 
	}
	
	private boolean validaCpf(String cpf) {
		if (cpf.length() > 0)
			return true;
		return false;
	}
}
