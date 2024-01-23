package classe;

public class PrimeiroTrauma {
	int a = 3; //não pode mexer aqui
	static int b = 4;
	
	public static void main(String[]args) {
		/* 	podemos acessar o atributo da classe instânciando 
		 um objeto dentro do método e acessando através do
		 Objeto.......
		 */
		PrimeiroTrauma t1 = new PrimeiroTrauma();
		System.out.println(t1.a);
		
	// para acessar um atributo dentro de um método static
	// podemos transformar o atributo em static 
		System.err.println(b);
	}
	
}
