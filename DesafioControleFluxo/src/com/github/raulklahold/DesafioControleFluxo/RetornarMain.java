package com.github.raulklahold.DesafioControleFluxo;

import java.util.Scanner;

public class RetornarMain {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		ColetarDados calc = new ColetarDados();

		System.out.println("Digite um numero inteiro: ");
		int numeroU = Scan.nextInt();
		calc.setParametroUM(numeroU);

		System.out.println("Digite um segundo numero inteiro: ");
		int numeroD = Scan.nextInt();
		calc.setParametroDois(numeroD);
		Scan.close();

		try {
			FunctionAndCalc.contar(calc);
		} catch (Exceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
