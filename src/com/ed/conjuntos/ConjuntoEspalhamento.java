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
			this.verificarCarga();
			int indice = this.calculaIndiceDaTabela(obj);
			List<String> lista = this.tabela.get(indice);
			lista.add(obj);
			this.tamanho++;	
		}
	}
	
	public void remove(String obj){
		if(this.contem(obj)){
			int indice = this.calculaIndiceDaTabela(obj);
			List<String> lista = this.tabela.get(indice);
			lista.remove(obj);
			this.tamanho--;
			this.verificarCarga();
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
	
	private int calculaCodigoDeEspalhamento(String obj){
		int codigo = 1;
		for (int i = 0; i < obj.length(); i++) {
			codigo = 31 * codigo + obj.charAt(i);
		}
		return codigo;
	}
	
	private int calculaIndiceDaTabela(String obj){
		//int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(obj);
		int codigoDeEspalhamento = obj.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	private void verificarCarga(){
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if(carga > 0.75){
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25){
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	private void redimensionaTabela(int novaCapacidade){
		List<String> palavras = this.pegaTodos();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			tabela.add(new LinkedList<>());
		}
		
		for (String palavra : palavras) {
			this.adiciona(palavra);
		}
	}

	public void imprimeTabela() {
		for (List<String> lista : this.tabela) {
			System.out.print("[");
			for (int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}

}
