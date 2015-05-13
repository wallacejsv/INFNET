
public class Usuario {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	double caloriasvet[] = new double[3];
		
	//entra com os dados
	public void Dados(String nome, int idade, double altura, double peso, double caloriasvet[]) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.caloriasvet = caloriasvet;
	}
	
	boolean insereCalorias(double caloriasvet) {
		if(caloriasvet <= 0) {
			System.out.println("Digite um valor diferente de 0");
			return false;
		} if (caloriasvet > ) {
			System.out.println("show");
			return false;
		}
		else {
			this.caloriasvet = this.caloriasvet;
			return true;
		}
		
	}

	
	
	/* 	Get's e Set's */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
