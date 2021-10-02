package br.com.fafic.estudos.classes;

public class Pilha {
	int elementos[];
	int tamanhoReal;

	public Pilha(int tamanho) {
		elementos = new int[tamanho];
		tamanhoReal = 0;
	}

	public void push(int e) {
		elementos[tamanhoReal] = e;
		tamanhoReal++;
	}

	public void pop() {
		if (tamanhoReal > 0) {
			tamanhoReal--;
			elementos[tamanhoReal] = 0;
		}
	}

	public boolean isEmpty() {
		if (tamanhoReal == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (tamanhoReal == elementos.length) {
			return true;
		}
		return false;
	}

	public int top() {
		return elementos[tamanhoReal-1];
	}
}
