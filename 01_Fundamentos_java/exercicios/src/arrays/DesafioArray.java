package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas deseja digitar?:");
		int quantidade = entrada.nextInt();
		quantidade -= 1;
		double notas[] = new double[quantidade];
		double total = 0;
		
		for (int i = 0; i <= notas.length; i++) {
			System.out.println("Digite "+(i+1)+"º nota:");
			notas[i] = entrada.nextDouble();
			total += notas[i];
		}
		
		
		
		System.out.println("A média é: "+total);
		
		entrada.close();

	}

}
