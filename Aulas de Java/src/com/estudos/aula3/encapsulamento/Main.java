package com.estudos.aula3.encapsulamento;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		String[] nomes = { "Jose", "Joao", "Francisco", "Lucas", "Joaquim" };
		Data data = new Data(02, 03, 2020);
		
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario(nomes[i]);
			f.setSalario(1000 + i * 100);
			empresa.adiciona(f);
			f.setDataEntrada(data);
		}
		
		empresa.getAllFuncionarios();
//		System.out.println(empresa.getFuncionario(2).getNome());
	}
}
