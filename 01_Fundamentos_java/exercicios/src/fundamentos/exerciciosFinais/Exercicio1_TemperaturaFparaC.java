package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Exercicio1_TemperaturaFparaC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit:");
		double f = entrada.nextDouble();
		
		double c = (f - 32)*(5.0/9.0);
		System.out.printf("A temperatura em Celsius fica: %.2f", c);
		
		
		
		entrada.close();

	}

}
