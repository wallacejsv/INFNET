import java.util.ArrayList;


public class Exercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
		
		numerosInteiros.add(3);
		numerosInteiros.add(6);
		numerosInteiros.add(9);
		numerosInteiros.add(12);
		numerosInteiros.add(15);
		
		boolean a = progAri(numerosInteiros, 3);
		System.out.println(a);

	}

	private static boolean progAri(ArrayList<Integer> numerosInteiros, int razao) {
		for(int i = 0; i <= numerosInteiros.size()-2; i++) {
			if(numerosInteiros.get(i+1) != (numerosInteiros.get(i)) + razao) {
				return false;
			}
		}
		return true;
	}

}
