package estruturas_de_controleDesafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio06_AdivinheONumero {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);
		int numCerto,numDigitado;
		
		
		numCerto = aleatorio.nextInt(100);
		System.out.println(numCerto);
		
		
		laco:for (int i = 0; i < 10; i++) {
			System.out.println("Acerte o número Aleatório:");
			numDigitado = entrada.nextInt();
			
			if (numDigitado>numCerto) {
				System.out.printf("O numero %d é maior que o Número correto ",numDigitado);
			}
			if(numDigitado<numCerto) {
				System.out.printf("O numero %d é menor que o Número correto ",numDigitado);
			}else if(numDigitado==numCerto){
				System.out.println("Você acertou o Número !! era o "+numCerto);
				break laco;//ou i == 10;
			}
			System.out.println(" ");
		}
		
		
		
		entrada.close();
	}

}
