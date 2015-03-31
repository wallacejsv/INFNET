import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
	
		Conta conta1 = new Conta(500, TipoDeConta.CC);
		Conta conta2 = new Conta(600, TipoDeConta.CP);
		
		Cliente cliente1 = new Cliente("Wallace", 27797554, 20, conta1);
		Cliente cliente2 = new Cliente("Wallace", 27797554, 39, conta2);
		
		ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();
		listaclientes.add(cliente1);
		listaclientes.add(cliente2);
				
		Banco banco = new Banco("Banco do pobre", listaclientes);
	
		Banco.exibeClientes(listaclientes);
		
		ArrayList<Cliente> cli = banco.getClientes();
		if(cli.get(0).equals(cli.get(1))) {
			System.out.println("sao iguais");
		} else {
			System.out.println("nao sao iguais");
		}
		
		
	}


}
