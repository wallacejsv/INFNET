import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		
		
		Scanner entrada = new Scanner(System.in);
		Usuario user = new Usuario("wallace", 20, 1.71, 60);

		double c = 0;
		int count = 0;

		//calorias
		do {
	
			System.out.println("Entre com a caloria do dia");

			try {
				System.out.println((count + 1) + ".o dia: ");
				c = entrada.nextDouble();
				if(c == 0) {
					System.out.println("NENHUMA CALORIA ? PARABEns");
				}
			}

			catch (InputMismatchException e) {
				System.out.println("dado invalido, entre com a caloria novamente.");
				entrada.next();
			}
			
			if(c != 0) {
				user.getCaloriasvet()[count] = c;
			}
			
			count ++;
		}while(count < user.getCaloriasvet().length);
		entrada.close();


		Imc.imcAtual(user.getPeso(), user.getAltura());


	} //main


}
