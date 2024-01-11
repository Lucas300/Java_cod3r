package estruturas_repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//if(....){ cod }
		//while(....){  cod }
		//for(..;..;..){ cod }
		
		//do{  }while(.....); ela entrará pelo menos uma vez antes da condição
		Scanner entrada = new Scanner(System.in);
		String texto = "";	
		
		do {
				System.out.println("Digite as palavras mágicas..");
				System.out.print("Quer Sair?");
				texto = entrada.next();
		}while(!texto.equalsIgnoreCase("sair"));
		System.out.println("Obrigado");
		entrada.close();
	}

}
