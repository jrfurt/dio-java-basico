package com.estudos.aula5.classesabstratas;

abstract class Funcionario {
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
	
	abstract double getBonificacao();
}
