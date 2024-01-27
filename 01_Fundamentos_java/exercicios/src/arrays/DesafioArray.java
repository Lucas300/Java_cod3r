package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//O usuário ira digitar a quantidade de notas 
		
		System.out.print("Quantas notas deseja digitar?:");
		int quantidade = entrada.nextInt();
		double notas[] = new double[quantidade];
		double total = 0;
		
		for (int i = 0; i <= (quantidade-1); i++) {
			System.out.println("Digite "+(i+1)+"º nota:");
			notas[i] = entrada.nextDouble();
			total += notas[i];
		}
		
		
		
		System.out.println("A média é: "+total/quantidade);
		
		entrada.close();

	}

}
