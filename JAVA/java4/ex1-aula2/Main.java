import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Usuario user = new Usuario();
		
		Usuario insere = new Usuario();
		
		
		
		boolean fim = false;
		/*while(fim == false) {
			try {
				System.out.println("Entre com o  nome: ");
				user.setNome(entrada.nextLine());
				System.out.println("Entre com a idade: ");
				user.setIdade(entrada.nextInt());
				System.out.println("Entre com a altura: ");
				user.setAltura(entrada.nextDouble());
				System.out.println("Entre com o peso: ");
				user.setPeso(entrada.nextDouble());
				fim = true;
			}
			
			catch(Exception e) {
				System.out.println("error");
			}
		}*/
		
		do {
			System.out.println("Entre com a caloria do dia: ");
			insere.caloriasvet = insere.insereCalorias(20);
		} while (fim == false); {
			
			insere.insereCalorias(entrada.nextDouble());
			
		}
		
		

	}



}
