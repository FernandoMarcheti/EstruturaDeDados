package com.ed.mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {
	
	private List<Associacao> associacoes = new ArrayList<>();
	
	public void adiciona(String placa, Carro carro){
		if(!this.contemChave(placa)){
			Associacao associacao = new Associacao(placa, carro);
			this.associacoes.add(associacao);
		}
	}
	
	public Carro pega(String placa){
		for (Associacao associacao : associacoes) {
			if(placa.equals(associacao.getPlaca())){
				return associacao.getCarro();
			}
		}
		throw new IllegalArgumentException("Chave não existe");
	}
	
	public void remove(String placa){
		if(this.contemChave(placa)){
			for(int i = 0; i < associacoes.size(); i++){
				Associacao associacao = associacoes.get(i);
				
				if(placa.equals(associacao.getPlaca())){
					this.associacoes.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave não existe");
		}
	}
	
	public boolean contemChave(String placa){
		for (Associacao associacao : associacoes) {
			if(placa.equals(associacao.getPlaca())){
				return true;
			}
		}
		return false;
	}
	
	public int tamanho(){
		return associacoes.size();
	}

}
