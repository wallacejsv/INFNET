package com.br.prova;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {

		Integer[] vetor = { 0, 0, 0, 10, 10, 10, 10, 10, 10, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 7,
				7, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11 };
		Integer[] array = new Integer[1000];

		for (int x = 0; x < array.length; x++) {
			array[x] = 0;
		}

		for (int x = 0; x < vetor.length; x++) {
			for (int y = 0; y < vetor.length; y++) {
				if (vetor[x] == vetor[y]) {
					++array[vetor[x]];
					break;
				}
			}
		}
		int op = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				if (array[i] == 0) {
					System.out.println("Tem " + (array[i] + 1) + " numero(s) "
							+ i);
				} else
					System.out.println("Tem " + array[i] + " numero(s) " + i);
				if(i > op){
					op = i;
				}
			}
		}

		System.out.println("O numero que mais aparece é o: " + op);

	}

}
