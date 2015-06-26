package com.seguro;

public class SeguroPropriedade extends SeguroBase {

	private TipoDePropriedade tipo;
	

	
	public double ajusteDeCusto(int vencimento) {
		int dias = 30;
		double novoCusto;
		
		if (vencimento < dias) {
			novoCusto = getCustoAnual() + (getCustoAnual()*0.10);
				return novoCusto;		
		}
		
		return getCustoAnual();
	}

	@Override
	public void calcularVencimento(int vencimento) {
		int dias = 30;
		if (vencimento <= dias) {
			System.out.println("Vencimento se aproximando, faltam: " + vencimento + " dias");
		} else {
			System.out.println("Vencimento nao se aproximando, faltam: " + vencimento + " dias");
		}
	}

	@Override
	public double ajusteDeCusto(double percentual) {
		// TODO Auto-generated method stub
		return 0;
	}

	public TipoDePropriedade getTipo() {
		return tipo;
	}

	
	
	
	
}
