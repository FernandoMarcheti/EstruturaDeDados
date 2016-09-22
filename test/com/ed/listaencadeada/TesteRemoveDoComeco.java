package com.ed.listaencadeada;

public class TesteRemoveDoComeco {

	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<>();
	    
	    lista.adiciona("Rafael");
	    lista.adiciona("Paulo");
	    
	    lista.removeDoComeco();
	    
	    System.out.println(lista);

	}

}
