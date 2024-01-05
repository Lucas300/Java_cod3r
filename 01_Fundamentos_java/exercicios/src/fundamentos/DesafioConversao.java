package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salário");
		String salario1 = entrada.next().replace(",", "."); //Podemos usar o Replace para subistituir a , por .
		
		System.out.println("Digite o Segundo salário");
		String salario2 = entrada.next().replace(",",".");
		
		System.out.println("Digite o Terceiro salário");
		String salario3 = entrada.next().replace(",",".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		double media = (s1 + s2 + s3)/3;
		
		System.out.println("Média "+ media);
		
		entrada.close();
		
	}
}
