package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1
		a--; //a = a - 1
		
		++b; //b = b + 1;
		--b; //b = b - 1;

		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); //verdadeiro pq o java interpreta primeiro o ++a --a ++b --b
		System.out.println(a == b); //falso
		System.out.println(a);
		System.out.println(b);
	}

}
