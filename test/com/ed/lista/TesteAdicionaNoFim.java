package com.ed.lista;
import com.ed.lista.entidade.Aluno;
import com.ed.lista.estruturas.Vetor;


public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
	    Aluno a2 = new Aluno();

	    a1.setNome("Jo�o");
	    a2.setNome("Jos�");

	    Vetor<Aluno> lista = new Vetor<>();

	    lista.adiciona(a1);
	    lista.adiciona(a2);

	    System.out.println(lista);

	}

}
