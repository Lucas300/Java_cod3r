package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Exercicio5_AreaTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura do triangulo");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("A area do triangulo é: %.2f",area);
		
		

	}

}
