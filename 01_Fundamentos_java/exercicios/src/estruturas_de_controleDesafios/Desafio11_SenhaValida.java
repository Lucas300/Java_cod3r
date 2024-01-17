package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio11_SenhaValida {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int senha;
		System.out.print("Digite a senha:" );
		senha = entrada.nextInt();
		while(senha != 2002){
			System.out.print("Senha invalida! tente outra senha: ");
			senha = entrada.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		
		entrada.close();	
	}
}
