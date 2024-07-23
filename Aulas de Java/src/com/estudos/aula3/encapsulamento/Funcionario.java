package com.estudos.aula3.encapsulamento;

public class Funcionario {
	private static int identificador;
	
	private int idFuncionario;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	// CONSTRUCTORS
	Funcionario() {
		idFuncionario = identificador;
		identificador += 1;
	}
	
	Funcionario(String nome) {
		idFuncionario = identificador;
		this.nome = nome;
		identificador += 1;
	}
	
	// GETTERS
	public int getIdentificador() {
		return idFuncionario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void getDataEntrada() {
		System.out.println("Data de entrada: " + dataEntrada.dataFormatada());
	}
	
	public String getRg() {
		return rg;
	}
	
	public boolean getEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	
	// SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double setSalario(double salario) {
		return this.salario = salario;
	}
	
	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	// METHODS
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public void demite() {}
	
	public double calculaGanhoAnal() {
		return this.salario * 12;
	}
}
