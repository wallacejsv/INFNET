package com.bem;

public class Imovel extends Bem {

	private AreaDoImovel area;
	
	//encapsulamento
	public AreaDoImovel getArea() {
		return area;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	private String bairro;
	
}
