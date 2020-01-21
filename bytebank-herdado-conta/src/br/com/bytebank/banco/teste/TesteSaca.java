package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1333, 1444);
		conta.deposita(200);
		try {
			conta.saca(290);	
		} catch(Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
	
		System.out.println(conta.getSaldo());
	}
}
