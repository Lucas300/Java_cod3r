package fundamentos.operadores;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		System.out.println("TV de 50 polegadas :"+(trabalho1 && trabalho2));
		System.out.println("TV de 32 polegadas: "+(trabalho1 ^ trabalho2));
		System.out.println("Vamos tormar sorvete: "+(trabalho1  || trabalho2));
		System.out.println("Vamos ficar em casa: "+(!trabalho1 && !trabalho2));
		
	}

}
