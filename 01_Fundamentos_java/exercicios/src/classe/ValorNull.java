package classe;

public class ValorNull {
	public static void main(String[] args) {
		/*
		 null é um valor que não aponta pra um endereço 
		 de um objeto na memória
		 */
		String s1 = "";
		String s2 = null;
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		System.out.println(s1.concat("!!!"));
		
		//Melhor sempre verificar se a variavel é null
		if(s2 != null) {
			System.out.println(s2.concat("????"));		
		}
		
		if(d1 != null){
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}

		
		
	}
}
