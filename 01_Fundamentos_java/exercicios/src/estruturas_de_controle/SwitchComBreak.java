package estruturas_de_controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		String conceito = "";
		
		switch(nota) {
		case 9: case 10 :
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 5: case 6:
			conceito = "C";
			break;
		case 3: case 4:
			conceito = "D";
			break;
		case 1: case 2:
			conceito = "E";
			break;
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encotrado";
		}
		System.out.println("O conceito é: "+conceito);
		entrada.close();
	}

}
