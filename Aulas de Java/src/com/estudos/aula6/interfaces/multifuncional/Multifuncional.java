package com.estudos.aula6.interfaces.multifuncional;

import com.estudos.aula6.interfaces.copiadora.Copiadora;
import com.estudos.aula6.interfaces.digitalizadora.Digitalizadora;
import com.estudos.aula6.interfaces.impressora.Impressora;

public class Multifuncional implements Impressora, Digitalizadora, Copiadora {

	@Override
	public void copiar() {
		System.out.println("Copiando com multifuncional...");
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando com multifuncional...");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo com multifuncional...");
	}

}
