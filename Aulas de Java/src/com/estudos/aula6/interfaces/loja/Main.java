package com.estudos.aula6.interfaces.loja;

import com.estudos.aula6.interfaces.copiadora.Copiadora;
import com.estudos.aula6.interfaces.copiadora.Xerox;
import com.estudos.aula6.interfaces.digitalizadora.Digitalizadora;
import com.estudos.aula6.interfaces.digitalizadora.Scanner;
import com.estudos.aula6.interfaces.impressora.Impressora;
import com.estudos.aula6.interfaces.impressora.Laserjet;
import com.estudos.aula6.interfaces.multifuncional.Multifuncional;

public class Main {
	public static void main(String[] args) {
		Digitalizadora digitech = new Scanner();
		Impressora impressora = new Laserjet();
		Copiadora copiadora = new Xerox();
		
		digitech.digitalizar();
		impressora.imprimir();
		copiadora.copiar();
		
		Multifuncional multi = new Multifuncional();
		
		multi.copiar();
		multi.digitalizar();
		multi.imprimir();
	}
}
