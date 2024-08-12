package controller;

public class DivisaoController {
	public DivisaoController() {
		super();
	}
	public int calcular(int dividendo, int divisor) {
		if(dividendo < divisor) {
			return 0;
		} else {
			dividendo -= divisor;
			return 1 + calcular(dividendo, divisor);
		}
	}
}
