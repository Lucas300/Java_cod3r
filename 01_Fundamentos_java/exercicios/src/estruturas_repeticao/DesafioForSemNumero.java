package estruturas_repeticao;

public class DesafioForSemNumero {
	public static void main(String[] args) {
		 String valor = "#";
		for(int i= 1; i<=5; i++) {
			System.out.println(valor);
			valor+="#";
		}
		System.out.println("Sem valor numérico:");
		//versão do desafio
		//sem valor númerico, usando String
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
		
	}
}
