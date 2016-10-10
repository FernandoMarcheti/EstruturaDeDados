package com.ed.mapas.espalhamento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.ed.mapas.Associacao;
import com.ed.mapas.Carro;

public class MapaEspalhamento {

	private List<List<Associacao>> tabela = new ArrayList<>();
	
	public MapaEspalhamento() {
		for (int i = 0; i < 100; i++) {
			tabela.add(new LinkedList<>());
		}
	}
	
	public boolean contemChave(String placa){
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = lista.get(i);
			if(placa.equals(associacao.getPlaca())){
				return true;
			}
		}
		return false;
	}
	
	public void remove(String placa){
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = lista.get(i);
			if(placa.equals(associacao.getPlaca())){
				lista.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("A Chave não existe");
	}
	
	public void adiciona(String placa, Carro carro){
		if(this.contemChave(placa)){
			this.remove(placa);
		}
		
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);
		lista.add(new Associacao(placa, carro));
	}
	
	public Carro pega(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = lista.get(i);
			if (associacao.getPlaca().equals(placa)) {
				return associacao.getCarro();
			}
		}

		throw new IllegalArgumentException("A chave não existe");
	}
	
	private int calculaIndiceDaTabela(String placa){
		return Math.abs(placa.hashCode()) % tabela.size();
	}
}
