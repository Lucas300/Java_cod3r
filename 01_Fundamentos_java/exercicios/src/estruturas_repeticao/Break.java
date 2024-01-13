package estruturas_repeticao;

public class Break {
	public static void main(String[] args) {

		/*O break é usado para interromper a estrura de controle
		 de for inesperada, e pode ser usado no while,for e switch*/
		for (int i = 0; i < 10; i++) {
			//o break interrompera o for assim que o valor for igual a 5
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
	}
}
