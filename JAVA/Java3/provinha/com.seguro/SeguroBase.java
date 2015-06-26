package com.seguro;

public abstract class SeguroBase {

	protected String nomeApolice;
	protected int diasParaVencimento;
	protected double custoAnual;
	protected double indenizacao;
	
	public abstract double ajusteDeCusto(double percentual);
	public abstract void calcularVencimento(int vencimento);
	
	//encapsulamento
	public String getNomeApolice() {
		return nomeApolice;
	}
	public void setNomeApolice(String nomeApolice) {
		this.nomeApolice = nomeApolice;
	}
	public int getDiasParaVencimento() {
		return diasParaVencimento;
	}
	public void setDiasParaVencimento(int diasParaVencimento) {
		this.diasParaVencimento = diasParaVencimento;
	}
	public double getCustoAnual() {
		return custoAnual;
	}
	public void setCustoAnual(double custoAnual) {
		this.custoAnual = custoAnual;
	}
	public double getIndenizacao() {
		return indenizacao;
	}
	public void setIndenizacao(double indenizacao) {
		this.indenizacao = indenizacao;
	}
	
	
	
}
