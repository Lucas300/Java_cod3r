package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Exercicio3_IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso , altura;
		System.out.println("Digite seu peso:");
		peso = entrada.nextDouble();
		
		System.out.println("digite sua altura: ");
		altura = entrada.nextDouble();
		
		double imc = peso/(altura * altura);
		
		System.out.printf("Seu Imc é %.2f ", imc);
		
		
		entrada.close();
		
	}

}
