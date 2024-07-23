package com.estudos.aula3.encapsulamento;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String dataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
}
