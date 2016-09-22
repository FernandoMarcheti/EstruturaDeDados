package com.ed.lista;

public interface EstruturaDeDados<T> {

	void adiciona(T data);
	
	void adiciona(int posicao, T data);
	
	T pega(int posicao);
	
	void remove(int posicao);
	
	boolean contem(T data);
	
	int tamanho();
}
