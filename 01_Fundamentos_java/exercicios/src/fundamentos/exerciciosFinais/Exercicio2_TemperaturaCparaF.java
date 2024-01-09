package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Exercicio2_TemperaturaCparaF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		double c = entrada.nextDouble();
		
		double f = (c *(9.0/5.0)) + 32;
		System.out.printf("A temperatura em Fahrenheit: fica: %.2f", f);
		
	
		entrada.close();

	}

}
