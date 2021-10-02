// autor: Jaasiel Antunes

package br.com.fafic.estudos.principal;

import br.com.fafic.estudos.classes.Fila;

public class TesteFila {

	public static void main(String[] args) {
		Fila f = new Fila(3);
		f.adicionar(12);
		f.adicionar(13);
		f.adicionar(14);
		
		f.imprimir();
		System.out.println();
		
		// remove um elemento escolhido (14 no caso em questão)
		f.remover();
		
		f.imprimir();
		
	}
}
