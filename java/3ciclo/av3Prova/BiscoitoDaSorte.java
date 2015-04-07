import java.util.ArrayList;


public class BiscoitoDaSorte {

	private ArrayList<PalavraAleatoria> palavras_biscoito;
	private String nome;
	private TipoBiscoito tipo;
	
	public static void exibeBiscoitos(ArrayList<PalavraAleatoria> palavras_biscoito) {
		for (PalavraAleatoria bisc : palavras_biscoito) {
			System.out.println(bisc);
		}
	}
	
	public BiscoitoDaSorte(ArrayList<PalavraAleatoria> palavras_biscoito, String nome, TipoBiscoito tipo) {
		this.palavras_biscoito = palavras_biscoito;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public ArrayList<PalavraAleatoria> getPalavras_biscoito() {
		return palavras_biscoito;
	}
	public void setPalavras_biscoito(ArrayList<PalavraAleatoria> palavras_biscoito) {
		this.palavras_biscoito = palavras_biscoito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoBiscoito getTipo() {
		return tipo;
	}

	public void setTipo(TipoBiscoito tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public String toString() {
		return "BiscoitoDaSorte [palavras_biscoito=" + palavras_biscoito
				+ ", nome=" + nome + "]";
	}


}
