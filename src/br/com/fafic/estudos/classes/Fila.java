package br.com.fafic.estudos.classes;

public class Fila {
	int elementos[];
	int tamanhoReal;
	
	public Fila(int tamanho) {
		elementos = new int [tamanho];
		tamanhoReal = 0;
	}
	
	public void adicionar(int e) {
		elementos[tamanhoReal] = e;
		tamanhoReal++;
	}
	
	public void remover() {
		if (tamanhoReal > 0) {
			for(int i = 0; i < tamanhoReal; i++) {
				if (i + 1 == tamanhoReal) {
					elementos[i] = 0;
					tamanhoReal --;
					break;
				}
				elementos[i] = elementos[i+1];
			}
		}
	}
	
	public void imprimir() {
		for(int i : elementos) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
