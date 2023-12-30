package fundamentos;

public class NotacaoPonto {
	public static void main(String[]args) {
		
		double a = 2.3;
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); //substitui um caractere por outro/s 
		s = s.toUpperCase(); //deixa a letra maiúscula
		s = s.concat(" !!!"); // concatena/adiciona novos caracteres a variavel
		
		System.out.println(s);
		
		System.out.println("Lucas".toUpperCase());
		
		String y = "bom dia x"
				.replace("x", "Lucas")
				.concat(" !!!")
				.toUpperCase();
		//podemos usar varios de uma vez, só seguir ordem lógica
		System.out.println(y);
	}
}
