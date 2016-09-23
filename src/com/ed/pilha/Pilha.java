package com.ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {

	List<T> objetos = new LinkedList<>();
	
	public void insere(T objeto){
		this.objetos.add(objeto);
	}
	
	public T remove(){
		return this.objetos.get(this.objetos.size() - 1);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
