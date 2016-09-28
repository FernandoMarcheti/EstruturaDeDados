package com.ed.fila;

import java.util.LinkedList;
import java.util.Queue;

import com.ed.lista.entidade.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Queue<Aluno> filaAPI = new LinkedList<Aluno>();
		
		Fila<Aluno> fila = new Fila<Aluno>();

	    Aluno aluno = new Aluno();
	    fila.insere(aluno);

	    Aluno alunoRemovido = fila.remove();

	    if (fila.vazia()) {
	      System.out.println("A fila está vazia");
	    }

	    Fila<String> filaDeString = new Fila<String>();
	    filaDeString.insere("Adelaide");
	    filaDeString.insere("Carolina");

	    String carolina = filaDeString.remove();
	    String adelaide = filaDeString.remove();

	    System.out.println(carolina);
	    System.out.println(adelaide);
	}

}
