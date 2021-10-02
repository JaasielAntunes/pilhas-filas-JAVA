// autor: Jaasiel Antunes

package br.com.fafic.estudos.principal;

import br.com.fafic.estudos.classes.Pilha;

public class TestePilha {

	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		
		p.push(3);
		p.push(6);
		p.push(9);
		p.push(12);
		p.push(15);
		
	    System.out.println("Elemento no topo da pilha: " + p.top());
	    System.out.println();
	    
	    p.pop();
	    
	    // remove um elemento da pilha
	    System.out.println(p.top());
	    System.out.println();
	    
	    // verifica se está vazia (retorna um boolean true ou false)
	    System.out.println(p.isEmpty());
	}
}
