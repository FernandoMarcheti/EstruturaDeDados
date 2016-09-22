package com.ed.listaencadeada;

public class Celula {
	
	private Celula proximo;
	private Object elemento;
	private Celula anterior;
	
	public Celula(Celula proximo, Object elemento) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proximo;
	}

	public void setProxima(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
}


