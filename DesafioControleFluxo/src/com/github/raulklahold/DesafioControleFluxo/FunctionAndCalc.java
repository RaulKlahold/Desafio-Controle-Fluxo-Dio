package com.github.raulklahold.DesafioControleFluxo;

public class FunctionAndCalc {
	public static int contar(ColetarDados ColetarDados ){
		
		int numeroUm = ColetarDados.getParametroUM();
		int numeroDois = ColetarDados.getParametroDois();
		int cont = numeroDois - numeroUm;
		
		for (int i = 0; i <= cont; i++) {
            System.out.println(i);
        }
		return cont;
		
		
	}
}
