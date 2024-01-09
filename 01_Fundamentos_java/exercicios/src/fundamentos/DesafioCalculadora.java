package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º Numero: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o 2º Numero: ");
		double n2 = entrada.nextDouble();
		System.out.println("Digite a operação + - * / %");
		String operacao = entrada.next();
		
		//Lógica
		double resultado = "+".equals(operacao)?n1 + n2:0;
		resultado = "-".equals(operacao)?n1-n2:resultado;
		resultado = "*".equals(operacao)?n1*n2:resultado;
		resultado = "/".equals(operacao)?n1/n2:resultado;
		resultado = "%".equals(operacao)?n1%n2:resultado;
		
		//Saída
		System.out.printf("%.2f %s %.2f = %.2f",n1 , operacao , n2 , resultado );
		entrada.close();
	}

}
