package com.seguro;

public enum TipoDePropriedade {
	
	VEICULO("Veiculo"), IMOVEL("Imovel");
	
	private String texto;

	private TipoDePropriedade(String texto) {
		this.texto = texto;
	}

	//encapsulamento
	public String getTexto() {
		return texto;
	}

	
}
