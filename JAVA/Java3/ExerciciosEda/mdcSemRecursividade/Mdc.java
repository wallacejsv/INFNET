import java.util.Scanner;


public class Mdc {
	
	Scanner entrada = new Scanner(System.in);
	
	public int x;
	public int y;
	
	public Mdc(int x_, int y_) {
		x = x_;
		y = y_;
	}
	
	public int maiorDivisor(int number1, int number2) {
		
		System.out.println("Entre com o primeiro numero: ");
		number1 = entrada.nextInt();
		System.out.println("Entre com o sugundo numero: ");
		number2 = entrada.nextInt();
		
		while(number2 != 0) {
			int resto = number1 % number2;
			number1 = number2;
			number2 = resto;
		}
		
		return number1;
	}

}
