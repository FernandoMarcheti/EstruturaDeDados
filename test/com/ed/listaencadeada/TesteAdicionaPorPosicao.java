package com.ed.listaencadeada;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {

		ListaLigada<String> lista = new ListaLigada<>();
	    lista.adiciona("Rafael");
	    lista.adiciona(0, "Paulo");
	    lista.adiciona(1, "Camila");
	    
	    System.out.println(lista);
	}

}
