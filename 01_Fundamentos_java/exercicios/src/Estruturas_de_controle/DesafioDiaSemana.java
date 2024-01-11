package Estruturas_de_controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//domingo = 1
		//segunda = 2
		//terça = 3
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		int dia = entrada.nextInt();
		
		if(dia > 7 || dia < 0) {
			System.out.println("Dia inválido");
		}else if(dia == 1) {
			System.out.println("Domingo");
		}else if(dia == 2) {
			System.out.println("Segunda");
		}else if(dia == 3) {
			System.out.println("Terça");
		}else if(dia == 4) {
			System.out.println("Quarta");
		}else if(dia == 5){
			System.out.println("Quinta");
		}else if(dia == 6) {
			System.out.println("Sexta");
		}else {
			System.out.println("Sabado");
		}
		
		
		
		entrada.close();
	

	}

}
