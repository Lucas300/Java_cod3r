package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio02_AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite um ano pra saber se é bissexto: ");
		int ano = entrada.nextInt();
		if(ano % 4 == 0) {
			System.out.printf("Ano é %d bissexto",ano);
		}else {
			System.out.printf("Ano %d não é bissexto",ano);
		}
		entrada.close();

	}

}
