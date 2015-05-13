import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Main {

	public static void main(String[] args) {

		//Main f = new Main(); //instanciando a variavel f
		int x = 0, y = 0;
		int r = 0;

		//entrada dos dados
		
		boolean fim = true;
		while(fim == true) {
			try {
				x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero:"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero:"));
				fim = false;
				int cancelar = JOptionPane.CANCEL_OPTION;
				if(x == cancelar || y == cancelar) {
					System.out.println("fim");
				}
				
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error, Entre com um numero:");
			}
		}
		//saida dos dados
		JOptionPane.showMessageDialog(null, "O MDC é: " + Main.mdc(x,y));
	}//fim do main

	public static int mdc(int x, int y){
		if (x <= y || x % y == 0){ //condição de parada
			return y;
		}else{
			if(x<y){
				return mdc(x,y);
			}else{
				return mdc(y, x%y);
			} //fim do else  
		} //fim do 2º if
	} // fim da função 
} //fim da classe



