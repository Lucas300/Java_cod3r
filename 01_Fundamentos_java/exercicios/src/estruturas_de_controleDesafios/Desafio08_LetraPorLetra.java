package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio08_LetraPorLetra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = entrada.nextLine();
		Integer contador = (palavra.length());
		for(int i = 0;i<contador;i++) {
			System.out.println(palavra.charAt(i));
		}

		entrada.close();
	}

}
