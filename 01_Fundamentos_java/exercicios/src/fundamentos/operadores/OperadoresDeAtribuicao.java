package fundamentos.operadores;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - b;
		c*= b;  // c = c * a;
		c/= a;  // c = c / a;
		
		// mod 
		c %= 2;  // c = c % 2; 0 ou 1
		
		

	}

}
