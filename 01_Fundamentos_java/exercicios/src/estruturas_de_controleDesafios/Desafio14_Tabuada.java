package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio14_Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Deseja a tabuada para qual valor?");
		int n = entrada.nextInt();
		for (int i = 0; i <= 10; i++) {
			var mult = n * i;
			System.out.printf(" %d x %d = %d\n",n,i,mult);
		}	
		
		entrada.close();

	}

}
