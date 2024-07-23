package com.estudos.aula4.heranca;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	// GETTERS
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	// SETTERS
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// METHODS
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
}
