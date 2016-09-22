package com.ed.listaencadeada;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<>();
	    
	    lista.adicionaNoComeco("Rafael");
	    lista.adicionaNoComeco("Paulo");
	    
	    System.out.println(lista);

	}

}
