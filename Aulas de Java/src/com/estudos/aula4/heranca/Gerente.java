package com.estudos.aula4.heranca;

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	// SETTERS
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// METHODS
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000; 
	}
}
