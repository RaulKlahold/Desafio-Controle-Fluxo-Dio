package com.github.raulklahold.DesafioControleFluxo;

@SuppressWarnings("serial")
public class Exceptions extends Exception {

   
	public Exceptions() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    public Exceptions(String message) {
        super(message);
    }
}