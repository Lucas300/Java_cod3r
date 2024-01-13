package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio01_verificarPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = entrada.nextInt();
		if(num % 2 == 0) {
			System.out.printf("O número %d é par",num);
			
		}else {
			System.out.printf("O número %d é impar",num);
		}
		
		entrada.close();

	}

}
