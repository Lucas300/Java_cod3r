package classe;

public class Jantar {
	public static void main(String[] args) {
	
	
	Comida c1 = new Comida("salada",0.180);
	Comida c2 = new Comida("carne",0.300);
	
	Pessoa p = new Pessoa("Lucas",99.80);
		
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar());
	p.comer(c2);
	System.out.println(p.apresentar());
	
	
		
	}

}
