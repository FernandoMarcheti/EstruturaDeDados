package com.ed.listaencadeada;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Fernando");
		lista.adiciona("J�o do Pulo");
		
		System.out.println(lista);
	}

}
