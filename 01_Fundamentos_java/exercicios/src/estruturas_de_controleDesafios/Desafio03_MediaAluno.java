package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio03_MediaAluno {
	public static void main(String[] args) {
		double n1,n2,media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota");
		n2 = entrada.nextDouble();
		
		media = (n1+n2)/2;
		if(media>=7.0 && media<=10.0) {
			System.out.printf("Aprovado com a media: %.2f",media);
		}
		if(media>=4.0 && media<7.0) {
			System.out.printf("De recuperação com a media: %.2f",media);
		}
		if(media>=0 && media<4.0) {
			System.out.printf("Reprovado com a media %.2f",media);
		}else if(media<0 || media>10){
			System.out.println("Notas invalidas");
		}
		entrada.close();

	}

}
