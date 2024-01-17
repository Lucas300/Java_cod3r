package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio13_PostoDeGasolina {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo = 0;
		
		int a = 0,d = 0,g = 0;
		do {
			System.out.printf("Informe um codigo (1, 2, 3) ou 4 para parar:");
			codigo = entrada.nextInt();
			switch(codigo) {
				case 1:
					a++;
					break;
				case 2:
					g++;
					break;
				case 3:
					d++;
					break;
				default:
					System.out.println("Código invalido fora dos padrões de 1 a 4");
					break;
			}
		}while(codigo != 4);
		System.out.printf("Alcool: %d\n Gasolina: %d\n Diesel: %d",a,g,d);
		entrada.close();
	}

}
