package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio10_CrescenteOuDecrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0,y = 0;
		
		do {
		System.out.println("Digite dois numeros");
		x = entrada.nextInt();
		y = entrada.nextInt();
		if (x < y) {
			System.out.println("CRESCENTE!");
		}
		if (x > y) {
			System.out.println("DECRESCENTE!");
		}
		
		}while(x != y);
		System.out.println("FIM");
		entrada.close();
	}

}
