
public class Cliente {
	
	private String nome;
	private int telefone;
	private int idade;
	private Conta conta;
	
	public Cliente(String nome, int telefone, int idade, Conta conta) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.conta = conta;
	}
	
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	//clientes iguais
	public boolean equals(Object obj) {
		if(obj instanceof Cliente) {
			Cliente x = (Cliente)obj;
			return (this.getNome().equals(x.nome) && this.getTelefone() == x.telefone);
		}
		
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", idade="
				+ idade + ", conta=" + conta + "]";
	}
	
	

}
