import java.util.ArrayList;

public class Banco {

	private String nome;
	private ArrayList<Cliente> clientes;
	
	public Banco(String nome, ArrayList<Cliente> clientes) {
		this.nome = nome;
		this.clientes = clientes;
	}
	
	public static void exibeClientes(ArrayList<Cliente> clientes) {
		for (Cliente cli : clientes) {
			System.out.println(cli);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	
}
