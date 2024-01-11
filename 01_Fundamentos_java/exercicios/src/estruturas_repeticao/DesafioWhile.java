package estruturas_repeticao;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			double nota = 0,total = 0;
			int notasValidas = 0 ;
			
			while(nota != -1) {
				System.out.print("Digite uma nota:");
				nota = entrada.nextDouble();
				if(nota<=10.0 && nota >=0.0) {
					System.out.println("Nota válida");
					notasValidas++;
					total = total + nota;
				}else{
					System.out.println("Nota inválida");
				}
			}
			double media = total/notasValidas;
			System.out.printf("O total de notas foram %d e a media foi %.2f",notasValidas,media );
			
			
		
		entrada.close();
	}
}
