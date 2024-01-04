package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Funciona em todas as Variáveis Long , Short 
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());//convertendo um int em um Integer para String
	
		//O java entende que esta gerando uma String e deixa usar o .length
		System.out.println((""+num2).length());
	}

}
