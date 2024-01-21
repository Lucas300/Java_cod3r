package classe;

public class DataTeste {

	public static void main(String[] args) {
		//usando o método contrutor padrão, e recebendo os valores através dele 
		var data1 = new Data();	
		
		//usando o método construtor com parâmetros 
		Data data2 = new Data(13,05,2000);
	
		
		//podemos polocar a variável + metodo dentro de outra variável para melhorar a vizualização
		String dataFormatada1 = data1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());

		data1.ImprimirDataFormatada();
		System.out.println();
		data2.ImprimirDataFormatada();
	}

}
