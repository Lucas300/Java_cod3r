package fundamentos.operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a==b);
		System.out.println(3 > 4); //maior 
		System.out.println(3 < 7); //menor
		System.out.println(4 >= 4);//maior ou igual
		System.out.println(3 <= 7);//menor ou igual
		System.out.println(3 != 7);//diferente
		
		double nota = 7.4;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento &&  passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		
	}
}
