package com.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	private List<List<String>> tabela = new ArrayList<>();
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
			List<String> lista = new LinkedList<>();
			tabela.add(lista);
		}
	}
	
	public void adiciona(String obj){
		if(!this.contem(obj)){
			int indice = this.calculaIndiceDaTabela(obj);
			List<String> lista = this.tabela.get(indice);
			lista.add(obj);
			this.tamanho++;
		}
	}
	
	public void remove(String obj){
		if(!this.contem(obj)){
			int indice = this.calculaIndiceDaTabela(obj);
			List<String> lista = this.tabela.get(indice);
			lista.remove(obj);
			this.tamanho--;
		}
	}
	
	public boolean contem(String obj){
		int indice = this.calculaIndiceDaTabela(obj);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(obj);
	}
	
	public List<String> pegaTodos(){
		List<String> palavras = new ArrayList<>();
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	public int tamanho(){
		return this.tamanho;	 
	}
	
	private int calculaIndiceDaTabela(String obj){
		return obj.toLowerCase().charAt(0) % 26;
	}

}
