package com.ed.lista;
import com.ed.lista.entidade.Aluno;
import com.ed.lista.estruturas.Vetor;


public class TesteTamanhoLista {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
	    Aluno a2 = new Aluno();
	    Aluno a3 = new Aluno();

	    a1.setNome("Rafael");
	    a2.setNome("Paulo");

	    Vetor<Aluno> lista = new Vetor<>();

	    lista.adiciona(a1);
	    lista.adiciona(a2);

	    System.out.println(lista.tamanho());
	        
	    lista.adiciona(a3);

	    System.out.println(lista.tamanho());

	}

}
