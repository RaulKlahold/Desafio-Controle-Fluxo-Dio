package com.github.raulklahold.DesafioControleFluxo;

public class FunctionAndCalc {
	public static int contar(ColetarDados coletarDados) throws Exceptions {
		int numeroUm = coletarDados.getParametroUM();
		int numeroDois = coletarDados.getParametroDois();

		if (numeroUm > numeroDois) {
			throw new Exceptions();
		}

		int cont = numeroDois - numeroUm;

		for (int i = 0; i <= cont; i++) {
			System.out.println(i);
		}
		return cont;
	}
}
