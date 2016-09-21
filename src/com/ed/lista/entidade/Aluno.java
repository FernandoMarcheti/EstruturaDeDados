package com.ed.lista.entidade;

public class Aluno {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno)obj;
		return this.nome.equals(aluno.nome);
	}
}
