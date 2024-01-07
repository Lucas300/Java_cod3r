package fundamentos.operadores;

public class DesafioAritmeticoResposta {

	public static void main(String[] args) {
		double numA = Math.pow((6*(3+2)),2);
		double numB =Math.pow((1-5)*(2-7), 2);
		double denA = 3*2;
		double denB = Math.pow(2,2);
		double superiorA = numA / denA;
		double superiorB = numB/ denB;
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		double resultado = superior/inferior;
		
		System.out.println(resultado);
		

	}

}
