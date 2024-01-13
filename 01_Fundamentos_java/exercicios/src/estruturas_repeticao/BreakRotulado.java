package estruturas_repeticao;

public class BreakRotulado {

	public static void main(String[] args) {
		//dando um nome para o laço
		externo:for (int i = 0; i < 3; i++) {
			interno:for (int j = 0; j < 3; j++) {
						if (i == 1) {
						/*estou falando que quero parar na condição do if,
				         usando laço externo*/
							break interno;	
						}	
					System.out.printf("[%d %d]",i , j);
			}
			System.out.println();
		}

	}

}
