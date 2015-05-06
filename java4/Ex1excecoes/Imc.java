
public class Imc {

	public static void imcAtual(double peso, double altura) {
		float imc =  (float) (peso / (altura * altura));
		System.out.println("Peso inicial: " + peso);
		System.out.printf("Seu imc e: %.2f\n", imc);

		if (imc < 16) {
			System.out.println("Magreza grave.");
		}
		
		if ((imc >= 16) && (imc < 17)) {
			System.out.println("Magreza moderada.");
		}
		
		if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("Magreza leve.");
		}
		
		if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("Saudavel.");
		}
		
		if ((imc >= 25) && (imc < 30)) {
			System.out.println("Sobrepeso.");
		}
		
		if ((imc >= 30) && (imc < 35)) {
			System.out.println("Obesidade Grau I.");
		}
		
		if ((imc >= 35) && (imc < 40)) {
			System.out.println("Obesidade Grau II.");
		}
		
		if (imc >= 40) {
			System.out.println("Obesidade Grau III2.");
		}
		
		
	}

}
