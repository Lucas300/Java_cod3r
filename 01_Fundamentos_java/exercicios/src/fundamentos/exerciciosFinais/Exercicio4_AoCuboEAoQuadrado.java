package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Exercicio4_AoCuboEAoQuadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num = entrada.nextDouble();
		double quadrado = Math.pow(num,2);
		double cubo = Math.pow(num,3);
		
		
		System.out.printf("Ao quadrado fica: %.2f e Ao cubo Fica: %.2f",quadrado,cubo);
		
		
		entrada.close();
	}

}
