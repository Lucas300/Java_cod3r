package fundamentos;

public class Temperatura {
	public static void main(String[]args) {
		//(f - 32) x 5/9 = °C
		final double fator = 5.0/9.0;
		final double ajuste = 32;
		double fahrenheit = 86;
		
		//calculo de conversão
		double celsius = ((fahrenheit - ajuste)*fator);
		System.out.println("A temperatura em °C fica: "  + celsius );
		
		fahrenheit = 0;
		celsius = ((fahrenheit - ajuste)*fator);
		System.out.println("A temperatura em °C fica: "  + celsius );
		//Ctrl + Alt + down   multiplica a linha
		//Ctrl + down or up   move a linha para baixo ou para cima
	}
}
