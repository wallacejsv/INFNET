import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>(); 
		entrada = new Scanner(System.in);
		
		while(numerosInteiros.size() < 5) {
			System.out.println("Entre com um numero: ");
			numerosInteiros.add(entrada.nextInt());
		}
		
		numerosInteiros.sort(null);
		
		System.out.println(numerosInteiros);
		
		//ordem inversa
		System.out.println("ORDEM INVERSA");
		for(int i = (numerosInteiros.size()-1); i >= 0; i--) {
			System.out.println(numerosInteiros.get(i));
		}
		
		//pares
		System.out.println("PARES");
		for(int i = 0; i < 5; i ++) {
			if(numerosInteiros.get(i)%2==0) {
				System.out.println("Numeros pares: " + numerosInteiros.get(i));
			}
		}
		
	}

}
