package fundamentos.operadores;
public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2); // !negação 
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao2);
		
		//tabela verdade E
		System.out.println("tabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		//tabela verdade OU 
		System.out.println("tabela verdade OU ");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//tabela verdade Ou exclusivo XOR
		//se der 2 verdadeiros o resultado será falso
		System.out.println("tabela verdade Ou exclusivo XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade not");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
	}
}
