
public class Usuario {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private double[] caloriasvet = new double[7];
		
	public Usuario(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		//this.caloriasvet = caloriasvet;
	}

	
	//verifica calorias 
	
	
	
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

	public double[] getCaloriasvet() {
		return caloriasvet;
	}

	public void setCaloriasvet(double[] caloriasvet) {
		this.caloriasvet = caloriasvet;
	}
	
	

}
