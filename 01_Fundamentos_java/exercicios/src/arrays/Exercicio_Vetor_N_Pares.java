package arrays;

import java.util.Scanner;

public class Exercicio_Vetor_N_Pares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = entrada.nextInt();
		//declarando o vetor
		int numero[] = new int[n],total_pares = 0;
		
		for (int contador = 0; contador <n; contador++) {
			System.out.print("Digite um numero: ");
			numero[contador] = entrada.nextInt();	
		}
		System.out.println("Numeros Pares:");
		//checando os numeros pares
		for (int contador = 0; contador <n; contador++) {
			if(numero[contador]%2 == 0) {
				System.out.print(numero[contador]+" ");
				total_pares = total_pares +1;
			}	
		}
		System.err.println(" ");
		System.out.println("QUANTIDADE DE PARES = "+total_pares);

	}

}
