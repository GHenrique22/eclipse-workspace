package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(333,333);
		cc.deposita(100);
		ContaCorrente c1 = new ContaCorrente(333,333);
		c1.deposita(100);
		ContaCorrente c2 = new ContaCorrente(333,333);
		c2.deposita(100);

		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(c1);
		calc.registra(c2);
		calc.registra(sv);
		System.out.println(calc.getTotalImposto());
	}

}
