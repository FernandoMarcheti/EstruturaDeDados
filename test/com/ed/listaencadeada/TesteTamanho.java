package com.ed.listaencadeada;

public class TesteTamanho {

	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<>();
	    
	    lista.adiciona("Rafael");
	    lista.adiciona("Paulo");
	    
	    System.out.println(lista.tamanho());
	    
	    lista.adiciona("Camila");
	    
	    System.out.println(lista.tamanho());

	}

}
