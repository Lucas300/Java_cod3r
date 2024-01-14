package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio07_NumerosPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0,n = 0;
		
		while (n>=0) {
			soma += n;
			System.out.print("Digite um número:");
			n = entrada.nextInt();
		}
		System.out.println("A soma dos números digitados é:"+soma);
		
		
		entrada.close();

	}

}
