package com.ed.pilha.msgcriptografada;


public class Principal {
	
	public static void main(String[] args) {
		String msg = "teste de criptografia";
		msg =  CriptograEDescriptografa.criptografaEDescriptografa(msg);
		System.out.println(msg);
		msg = CriptograEDescriptografa.criptografaEDescriptografa(msg);
		System.out.println(msg);
	}
}
