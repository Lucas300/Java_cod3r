package estruturas_de_controleDesafios;

import java.util.Scanner;

public class Desafio05_PrimoComSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//(n%n==0 && n%1==0 && !(n%2==0)&& !(n%3==0) && !(n%5==0) && !(n%7==0) && !(n%9==0))||(n== 2 ||  n ==3 || n==5 || n==7 )
		
		System.out.println("Digite um número");
		int n = entrada.nextInt();
		int n1;
		boolean b = ((n%n==0 && n%1==0 && !(n%2==0)&& !(n%3==0) && !(n%5==0) && !(n%7==0) && !(n%9==0))||(n== 2 ||  n ==3 || n==5 || n==7 ));
		
		if(b) {
			n1 = 1;
		}else {
			n1=0;
		}
						
		switch(n1){
		case 0:
			System.out.printf("O número %d não é Primo",n);
			break;
		case 1:
			System.out.printf("O número %d é Primo",n);
			break;
		}
		
		entrada.close();
	}

}
