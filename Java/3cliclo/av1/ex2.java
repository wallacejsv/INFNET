import java.util.ArrayList;


public class Exercicio2 {

	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Wallacez Jonathan");
		listaNomes.add("Araujo Jui");
		listaNomes.add("Olavo bittendcnaj");
		
		System.out.println(executa(listaNomes,4));

	}
	
	private static ArrayList<String> executa(ArrayList<String> listaNomes, int limite) {
		ArrayList<String> retornaAlgo = new ArrayList<String>();
		for(String d : listaNomes) {
			String c[] = d.split(" ");
			if(c.length>limite) {
				retornaAlgo.add(d);
			} else if (c[0].endsWith("z")) {
				retornaAlgo.add(d);
			}
		}
		return retornaAlgo;
	}

}
