package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio09_MaiorNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int nAtual = entrada.nextInt();
			if (nAtual >= maior) {
				maior = nAtual;
			}
		}
		System.out.println(maior);
		entrada.close();

	}

}
