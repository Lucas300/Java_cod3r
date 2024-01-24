package classe;

public class Jantar {
	public static void main(String[] args) {
	
	Pessoa pessoa = new Pessoa();
	pessoa.nome = "Lucas";
	pessoa.peso = 100.00;
	
	Comida comida1 = new Comida("salada",2.300);
	Comida comida2 = new Comida("carne",3.300);
	
	Double pesoFinal = pessoa.comer(comida1);
	pesoFinal = pessoa.comer(comida2);
	
	
	System.out.println("O "+pessoa.nome+ " tinha o peso de:"+pessoa.peso);
	System.out.println("Depois de comer ficou com o peso de "+pesoFinal);
		
	}

}
