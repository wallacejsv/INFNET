package aula01;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("nome", 0, 0.00, 0);
		
		System.out.println(p.QualNome("?") + " Você tem : " + p.CalculaIdade(0) + " anos");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------AGORA VAMOS CALCULAR SEU INDICE DE MASSA CORPORAL-----------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("IMC ATUAL: " + p.calculaAlturaEPeso(0.00, 00));
		
	}

}
