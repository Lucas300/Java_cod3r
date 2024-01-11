package Estruturas_de_controle;

import javax.swing.JOptionPane;

public class If_Else {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número");
		//convertendo o valor string em int 
		int numero = Integer.parseInt(valor);
		
		if(numero%2 == 0) {
			System.out.println("O número é par");
		}else{
			System.out.println("O número é impar");
		}
		
	}
}
