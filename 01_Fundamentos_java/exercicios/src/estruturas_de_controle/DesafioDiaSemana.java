package estruturas_de_controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//domingo = 1
		//segunda = 2
		//terça = 3
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		String dia = entrada.next();
		
		if("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		}else if("Segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if("Terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if("Sexta".equalsIgnoreCase(dia)){
			System.out.println("6");
		}else if("Sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("Dia inválido");
		}
		
		
		
		entrada.close();
	

	}

}
