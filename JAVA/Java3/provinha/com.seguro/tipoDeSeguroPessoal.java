package com.seguro;

public enum tipoDeSeguroPessoal {
	
	TRABALHO("Acidente de trabalho"), VIDA("Seguro de Vida");
	
	private String texto;

	private tipoDeSeguroPessoal(String texto) {
		this.texto = texto;
	}

	//encapsulamento
	public String getTexto() {
		return texto;
	}

}
