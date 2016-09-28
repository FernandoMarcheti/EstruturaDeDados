package com.ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<E> {
	
	private List<E> objetos = new LinkedList<>();
	
	public void insere(E objeto){
		objetos.add(objeto);
	}
	
	public E remove(){
		if(this.vazia()){
			throw new IllegalArgumentException("A fila está vazia");
		}
		return objetos.remove(0);
	}
	
	public boolean vazia(){
		return objetos.size() == 0;
	}

}
