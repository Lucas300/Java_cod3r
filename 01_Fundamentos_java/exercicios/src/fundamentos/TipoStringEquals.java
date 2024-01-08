package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); //falso  
		System.out.println("2".equals(s)); //verdadeiro, melhor jeito 
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2".equals(s.trim())); // .trim() tira os espaços caso o usuário digite 
		
		entrada.close();
		
	}
}
