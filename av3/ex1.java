package com.br.prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		if (num > 0 && num <= 3) {
			processa(num);
		} else {
			JOptionPane.showMessageDialog(null,
					"Erro, passe um valor entre 1 e 3.");
			System.exit(1);
		}

	}

	public static void processa(int num) {
		System.out.println(".......................................");

		String[] frases = new String[3];
		frases[0] = "ovo";
		frases[1] = "O programador deve imprimir a palavra mais longa da frase.";
		frases[2] = "todas as letras em caixa alta devem ser alteradas para caixa baixa e vice-versa.";

		if (num == 1) {
			System.out.println("Palíndromo\n");
			boolean palindromo = false;
			StringBuilder sb = new StringBuilder(frases[0]);
			if (sb.toString().equals(sb.reverse().toString())) {
				palindromo = true;
				System.out.println("Palindromo");
				System.out.println(sb.reverse().toString());
			}
			System.out.println("É palíndromo? " + palindromo);
		}
		if (num == 2) {
			String maiorPalavra = "";
			String[] palavras = frases[1].split(" ");
			for (String palavra : palavras) {
				if (palavra.length() > maiorPalavra.length()) {
					maiorPalavra = palavra;
				}

			}
			System.out.println("Maior palavra: " + maiorPalavra);
		}
		if (num == 3) {
			frase3(frases[2]);
		}
	}

	public static void frase3(String string) {
		System.out.println("Frase normal: " + string);
		// pegando todas as strings para o teste
		String[] array = string.split(" ");
		for (String nome : array) {
			System.out.print(new Principal().format(nome) + " ");
		}
	}

	private String format(String nome) {

		// verificando se esta fora do formato
		int tam = nome.length();

		for (int i = 0; i <= tam; i++) {
			if (!isFormated(nome)) {
				nome = nome.substring(0, i).toUpperCase() + nome.substring(i);
			}
		}
		return nome;
	} // metodo que voce deseja para realizar a verificacao do formato

	private boolean isFormated(String nome) {
		boolean ok = true;
		Character x = nome.charAt(0);
		// tranformando para caixa alta para comparacao posterior
		Character y = x.toUpperCase(x);

		// comparando, caso nao seja caixa alta entao formatar
		if (!y.equals(nome.charAt(0))) {
			y = x.toLowerCase(x);
			ok = false;
		}

		return ok;
	}
}
