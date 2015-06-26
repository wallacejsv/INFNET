package com.cliente;

import java.util.ArrayList;

import com.bem.Bem;
import com.bem.Imovel;
import com.bem.Veiculo;

public class Cliente {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected ArrayList<Bem> listaDeBens;
	
	public void cadastrarVeiculo() {
		Veiculo veiculo = new Veiculo();
		
		System.out.println("Entre com o nome do veiculo: ");
		veiculo.setNome(Utilidades.input.nextLine());
		System.out.println("Entre com o valor do veiculo");
		veiculo.setValor(Utilidades.input.nextDouble());
		System.out.println("Entre com o chassi do veiculo: ");
		veiculo.setChassi(Utilidades.input.nextLine());
		
		listaDeBens.add(veiculo);
	}
	
	public void cadastrarImovel() {
		Imovel imovel = new Imovel();
		
		System.out.println("Entre com o nome: ");
		imovel.setNome(Utilidades.input.nextLine());
		System.out.println("Entre com o valor");
		imovel.setValor(Utilidades.input.nextDouble());
		System.out.println("entre com a area do imovel: ");
		//exibir opções da area do imovel
		//fazer o usuario escolher
		System.out.println("Entre com o bairro: ");
		imovel.setBairro(Utilidades.input.nextLine());
		
		listaDeBens.add(imovel);
	}

}
