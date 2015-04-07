import java.util.ArrayList;

public class Main {
	
	public final static int MAXFRASE = 50;
	public final static int MAXWORD = 10;
	public final static char TESTCHAR = 'a';
	
	

	public static void main(String[] args) {
		
		//Cria frase
		PalavraAleatoria fraseQualquer = new PalavraAleatoria(MAXFRASE);
		
		while (!(fraseQualquer.toString().length() > MAXWORD)) {
			fraseQualquer = new PalavraAleatoria(MAXFRASE);
		}
		// mostrando a frase 
		System.out.println("Frase Gerada: "+fraseQualquer);
		
		BiscoitoDaSorte criaBiscoito = new BiscoitoDaSorte(null , "Biscoito delicia cremosa", TipoBiscoito.D);
		
		ArrayList<BiscoitoDaSorte> biscoitosorte = new ArrayList<BiscoitoDaSorte>();
		biscoitosorte.add(criaBiscoito);
		
		System.out.println(criaBiscoito);
		
		
		//ArrayList<PalavraAleatoria> palav = new ArrayList<PalavraAleatoria>();
		// substituindo por *
		for(int i = 0;i<=10;i++){
			fraseQualquer.replace((char)i,TESTCHAR);
		}
		
		
		/*for (PalavraAleatoria p : palav) {
			System.out.println(p.replace("z", "a"));
		}*/
		
		
		
			
			
		}
	}

