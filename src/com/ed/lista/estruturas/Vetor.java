package com.ed.lista.estruturas;

import com.ed.lista.EstruturaDeDados;
import com.ed.lista.entidade.Aluno;

public class Vetor<T> implements EstruturaDeDados<T> {
	
	private Object[] datas = new Object[10];
	
	private int totalDatas = 0;
	
	public void adiciona(T data){
		this.garantaEspaco();
		this.datas[this.totalDatas] = data;
		this.totalDatas++;
	}
	
	public void adiciona(int posicao, T data) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = this.totalDatas - 1; i >= posicao; i -= 1) {
			this.datas[i + 1] = this.datas[i];
		}

		this.datas[posicao] = data;
		this.totalDatas++;
	}
	
	public T pega(int posicao){
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return (T)this.datas[posicao];
	}
	
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalDatas - 1; i++) {
			this.datas[i] = this.datas[i + 1];
		}
		this.totalDatas--;
	}
	
	public boolean contem(T data){
		for (int i = 0; i < this.totalDatas; i++) {
			if(data.equals(this.datas[i])){
				return true;
			}
		}
		return false;
	}
	
	public int tamanho(){
		return this.totalDatas;
	}
	
	@Override
	public String toString() {
		if (this.totalDatas == 0) {
		    return "[]";
		  }

		  StringBuilder builder = new StringBuilder();
		  builder.append("[");

		  for (int i = 0; i < this.totalDatas - 1; i++) {
		    builder.append(this.datas[i]);
		    builder.append(", ");
		  }

		  builder.append(this.datas[this.totalDatas - 1]);
		  builder.append("]");

		  return builder.toString();
	}
	
	private void garantaEspaco() {
	    if (this.totalDatas == this.datas.length) {
	      Object[] novaArray = new Aluno[this.datas.length * 2];
	      for (int i = 0; i < this.datas.length; i++) {
	        novaArray[i] = this.datas[i];
	      }
	      this.datas = novaArray;
	    }
	  }

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDatas;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDatas;
	}
}
