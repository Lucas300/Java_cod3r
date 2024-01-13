package estruturas_de_controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "vermelha";
		/* sem o break ele pegara todos os 
		 cases abaixo da condição verdadeira */
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o tekki Shodan");
		case "roxa":
			System.out.println("Sei o heian Godan");
		case "verde":
			System.out.println("Sei o heian Yodan");
		case "laranja":
			System.out.println("Sei o heian Sandan");
		case "vermelha":
			System.out.println("Sei o heian Nidan");
		case "amarela":
			System.out.println("Sei o heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println(" ");
		
		int idade =2 ;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe Respirar");
		}

	}

}
