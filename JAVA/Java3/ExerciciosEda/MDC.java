package mdc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int number1 = entrada.nextInt();
		System.out.println("Entre com o segundo numero: ");
		int number2 = entrada.nextInt();
		
		System.out.println("o mdc dos valores: " + number1 + " e " + number2 + " = " + mdc(number1, number2));
		
	}

	private static int mdc(int x, int y) {
		
		if(y== 0) {
			return x;
		} else {
			return mdc(y, x % y);
		}
	}

}
