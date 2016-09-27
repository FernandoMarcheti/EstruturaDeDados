package com.ed.pilha.msgcriptografada;

import java.util.Stack;

public class CriptograEDescriptografa {
	
	private static Stack<Character> stack = new Stack<>();
	
	public static String criptografaEDescriptografa(String msg){
		String msgCripto = "";
		for (int i = 0; i < msg.length(); i++) {
			stack.push(msg.charAt(i));
		}
		for (int i = 0; i < msg.length(); i++) {
			msgCripto += stack.pop();
		}
		return msgCripto;
	}
}
