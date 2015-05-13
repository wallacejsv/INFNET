package clawal;

import java.util.Scanner;

public class CadastraServico {

	Scanner entrada = new Scanner(System.in);

	private String loja;
	private String responsavel;
	private String rota;
	private String data;
	private double valor;

	//Construtor
	public CadastraServico(String loja_, String responsavel_, String rota_, String data_, double valor_) {
		loja = loja_;
		responsavel = responsavel_;
		rota = rota_;
		data = data_;
		valor = valor_;
	}

	//metodo
	public void Total(String loja_, String responsavel_, String rota_, String data_, double valor_) {

		//System.out.println("Quantos serviços serão acrescentados? ");

		boolean fim = true;

		while(fim == true) {

			
			System.out.println("Nome da Loja: ");
			loja_ = entrada.nextLine();
			
			System.out.println("Nome do Responsável e/ou Gerente: ");
			responsavel_ = entrada.nextLine();
			

			System.out.println("Rota do serviço: ");
			rota_ = entrada.nextLine();
			

			System.out.println("Data do serviço: ");
			data_ = entrada.nextLine();
			

			System.out.println("Valor do serviço: ");
			valor_ = entrada.nextDouble();
			
			System.out.println("Digite [1] - adicionar ");
			System.out.println("Digite [2] - terminar ");
			
			
			int escolha = entrada.nextInt();
			if(escolha == 1) {
				
				System.out.println("Nome da Loja: ");
				loja_ = entrada.nextLine();
				entrada.next();
				
				System.out.println("Nome do Responsável e/ou Gerente: ");
				responsavel_ = entrada.nextLine();
				entrada.next();

				System.out.println("Rota do serviço: ");
				rota_ = entrada.nextLine();
				entrada.next();

				System.out.println("Data do serviço: ");
				data_ = entrada.nextLine();
				entrada.next();
				
				System.out.println("Valor do serviço: ");
				valor_ = entrada.nextDouble();
				entrada.next();
				fim = false;
			}
			if(escolha == 2) {
				System.out.println("----------------------------------------");
				System.out.println("Loja: " + loja_);
				System.out.println("Responsável/Gerente: " + responsavel_);
				System.out.println("Rota: " + rota_);
				System.out.println("Data: " + data_);
				System.out.println("Valor :" + valor_);
				System.out.println("----------------------------------------");
			}
		}
	}




	/*
	 * Get's Set's
	 */

	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}



}
