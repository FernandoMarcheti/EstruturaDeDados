package com.ed.listaencadeada;

public class Aluno {
	
	private String nome;
	
	private int idade;
	
	private Aluno proximo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Aluno getProximo() {
		return proximo;
	}

	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}
	
	

}
