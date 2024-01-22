package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		AreaCirc a1  = new AreaCirc(10);
		
		AreaCirc a2  = new AreaCirc(5);
		
		System.out.println(a1.area());
		//atribuindo um novo valor pi direto na classe
		// AreaCirc.pi = 3.1415;
		
		/*
		 não pode modificar o pi ja que virou uma 
		 constante através do static final
		 */
		System.out.println(a2.area());
		
		//acessando pi através da classe
		System.out.println(AreaCirc.pi);
		//colocando o valor de raio através de um metodo
		System.out.println(AreaCirc.area(100));
		
		
	}

}
