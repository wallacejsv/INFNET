package aula01;

import java.util.Scanner;

public class Pessoa {

	Scanner entrada = new Scanner(System.in);

	public String nome;
	public int idade;
	public double altura;
	public double peso;

	//Construtor
	public Pessoa(String nome_, int idade_, double altura_, double peso_) {
		nome = nome_;
		idade = idade_;
		altura = altura_;
		peso = peso_;
	}

	//metodo nome
	public String QualNome(String nome_) {
		System.out.println("Entre com seu nome: ");

		nome_ = entrada.nextLine();
		return nome_;
	}

	//metodo idade
	public int CalculaIdade(int idade_) {

		boolean fim = true;

		while(fim == true) {
			try {

				System.out.println("Entre com sua idade: ");

				idade_ = entrada.nextInt();
				if (idade_ < 18) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("			Você é de menor				");
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
				} else {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("			Você é de Maior				");
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
				}
				fim = false;
				return idade_;
			} 
			catch(Exception InputMismatchException) {
				System.out.println("ERROR: Entre com a idade válida.");
				entrada.next();
			}
		}
		return idade_;
	}

	//metodo altura e peso
	public double calculaAlturaEPeso(double altura_, double peso_) {

		boolean fim = true;
		while(fim == true) {
			try {
				System.out.println("");
				System.out.println("Entre com sua altura: ");
				altura_ = entrada.nextDouble();	

				System.out.println("Entre com seu peso: ");
				peso_ = entrada.nextDouble();

				double imcAtual = (float) (peso_ / (altura_ * altura_));

				if(imcAtual <= 18.5) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Abaixo do Peso.");
					System.out.println("---------------------------------------------------------------------");
				} 
				if (imcAtual >= 18.6 && imcAtual <= 24.9) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Peso Ideal.");
					System.out.println("---------------------------------------------------------------------");
				} 
				if (imcAtual >= 25 && imcAtual <= 29.9) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Pouco acima do peso.");
					System.out.println("---------------------------------------------------------------------");
				}	
				if (imcAtual >= 30 && imcAtual <= 34.9) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Primeiro Grau de Obesidade.");
					System.out.println("---------------------------------------------------------------------");
				}
				if (imcAtual >= 35 && imcAtual <= 39.9) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Segundo Grau de Obesidade.");
					System.out.println("---------------------------------------------------------------------");
				}
				if (imcAtual >= 40){
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Obesidade mórbida.");
					System.out.println("---------------------------------------------------------------------");
				}

				fim = false;
				return imcAtual;
			}

			catch(Exception InputMismatchException) {
				System.out.println("ERROR: Entre com um valor válido. Ex.: 1,60");
				entrada.next();
			}
		} 
		return peso_;
	}
}
