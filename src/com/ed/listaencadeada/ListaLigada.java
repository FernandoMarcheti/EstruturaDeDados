package com.ed.listaencadeada;

import com.ed.lista.EstruturaDeDados;

public class ListaLigada<T> implements EstruturaDeDados<T> {
	
	private Celula primeira, ultima;
	private int totalDeElementos;

	@Override
	public void adiciona(T data) {
		if(totalDeElementos == 0){
			this.adicionaNoComeco(data);
		} else {
			Celula celula = new Celula(null, data);
			this.ultima.setProxima(celula);
			celula.setAnterior(this.ultima);
			this.ultima = celula;
			this.totalDeElementos++;
		}
	}

	@Override
	public void adiciona(int posicao, T data) {
		if(posicao == 0){
			this.adicionaNoComeco(data);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(data);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
		    Celula proxima = anterior.getProxima();
		    Celula nova = new Celula(anterior.getProxima(), data);
		    nova.setAnterior(anterior);
		    anterior.setProxima(nova);
		    proxima.setAnterior(nova);
		    this.totalDeElementos++;
		}
	}

	@Override
	public T pega(int posicao) {
		return (T) this.pegaCelula(posicao).getElemento();
	}

	@Override
	public void remove(int posicao) {
		if(!this.posicaoOcupada(0)){
			throw new IllegalArgumentException("Posição inválida");
		}
		
		if(posicao == 1){
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos-1){
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}

	@Override
	public boolean contem(T data) {
		Celula atual = this.primeira;
		
		while(atual != null){
			if(atual.getElemento().equals(data)){
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}

	@Override
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0){
			return "Lista vazia";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		Celula atual = primeira;
		for (int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0){
			Celula nova = new Celula(null, elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(primeira, elemento);
			primeira = nova;
		}
		this.totalDeElementos++;
	}
	
	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao){
		if(!posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		
		Celula celula = primeira;
		for (int i = 0; i < posicao; i++) {
			celula = primeira.getProxima();
		}
		return celula;
	}

}
