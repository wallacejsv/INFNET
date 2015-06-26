package com.seguro;

public class SeguroPessoal extends SeguroBase {
	
	private tipoDeSeguroPessoal tipo;
	private String beneficiario;

	@Override
	public double ajusteDeCusto(double percentual) {
		double novoCusto = getCustoAnual() + (getCustoAnual() * percentual);
		return novoCusto;
	}

	@Override
	public void calcularVencimento(int vencimento) {
		int dias = 180;
		if (vencimento <= dias) {
			System.out.println("Vencimento se aproximando, faltam: " + vencimento + " dias.");
		} else {
			System.out.println("Vencimento não aproximado, faltam: " + vencimento + " dias");
		}
	}

	
	//encapsulamento
	public tipoDeSeguroPessoal getTipo() {
		return tipo;
	}

	public void setTipo(tipoDeSeguroPessoal tipo) {
		this.tipo = tipo;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	
	
	
}
