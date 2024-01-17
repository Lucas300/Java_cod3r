package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio12_NotasValidas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.print("Digite a primeira nota:");
			double nota1 = entrada.nextDouble();
			while(nota1>10 || nota1 <0) {
				System.out.print("Valor invalido! tente novamente:");
				nota1 = entrada.nextDouble();
			}
			System.out.print("Digite a segunda nota:");
			double nota2 = entrada.nextDouble();
			while(nota2>10 || nota2 <0) {
				System.out.print("Valor invalido! tente novamente:");
				nota2 = entrada.nextDouble();
			}
			double media = (nota1 + nota2)/2;
			System.out.printf("Média: %.2f",media);
		
		entrada.close();

	}
}
