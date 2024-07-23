package com.estudos.aula3.arrays.empresa;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4 = new Funcionario();
		
		funcionario1.nome = "Camelo";
		funcionario2.nome = "Joao";
		funcionario3.nome = "Antonio";
		funcionario4.nome = "Lazaro";
		
		empresa.adiciona(funcionario1);
		empresa.adiciona(funcionario2);
		empresa.adiciona(funcionario3);
		empresa.adiciona(funcionario4);
		
		empresa.printFuncionarios();	
	}
	
	static class Funcionario {
		String nome;
	}
	
	static class Empresa {
		String nome;
		Funcionario[] empregados = new Funcionario[4];
		String cnpj;
		int countFuncionarios;
		
		void adiciona(Funcionario f) {
			this.empregados[countFuncionarios] = f;
			this.countFuncionarios += 1;
		}
		
		void printFuncionarios() {
			for (Funcionario i : this.empregados) {
				System.out.println(i.nome);
			}
		}
	}
}
