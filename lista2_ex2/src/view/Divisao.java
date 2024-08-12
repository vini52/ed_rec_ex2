package view;

import controller.DivisaoController;

public class Divisao {

	public static void main(String[] args) {
		DivisaoController obj = new DivisaoController();
		
		int dividendo = 20;
		int divisor = 2;
		
		System.out.println(obj.calcular(dividendo, divisor));

	}

}
