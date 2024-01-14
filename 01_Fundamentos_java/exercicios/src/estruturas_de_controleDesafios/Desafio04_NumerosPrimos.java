package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio04_NumerosPrimos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.print("Digite um Número:");
			int n = entrada.nextInt(); 
			if((n%n==0 && n%1==0 && !(n%2==0)&& !(n%3==0) && !(n%5==0) && !(n%7==0) && !(n%9==0))||(n== 2 ||  n ==3 || n==5 || n==7 )) {
					System.out.printf("O número %d é primo",n);
				 
			}else {
				System.out.printf("O número %d não é primo",n);
			}
		entrada.close();

	}

}
