package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/*
		Inferencia, podemos 
		declarar uma variavel como var NomeDaVariavel
		e ela recebera um tipo de variavel com base no valor que receber
		*/
		
		double a = 4.5;
		System.out.println("a");
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "outro texto" ;
		System.out.println(c);
		
		/* Após o tipo ser atribuido na variavel,
		não é possivel colocar outro tipo */ 
	
	}
}
