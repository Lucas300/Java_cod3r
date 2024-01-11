package estruturas_repeticao;

import java.util.Scanner;

public class Exercicio_while {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		while (!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Digite alguma palavra: ");
			palavra = entrada.next();
		}
		entrada.close();
	}
}
