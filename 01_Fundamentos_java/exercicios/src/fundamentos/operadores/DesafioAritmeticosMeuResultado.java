package fundamentos.operadores;

public class DesafioAritmeticosMeuResultado {

	public static void main(String[] args) {
		//  Ordem de Precendêcia
		//  * / % + -
		
		
		
		int left = (int)Math.pow((6*(3+2)), 2)/(3*2);
		int right = (int)Math.pow( (((1-5)*(2-7))/2),2);
		int result = (int)Math.pow(left - right,3)/(int)Math.pow(10, 3);
		System.out.println(result);
		
		

	}

}
