package classe;

public class DataTeste {

	public static void main(String[] args) {
		var data1 = new Data();
		data1.ano = 2000;
		data1.dia =13;
		data1.mes = 5;
		
		Data data2 = new Data();
		data2.ano = 1980;
		data2.dia = 11;
		data2.mes = 7;
		
		//podemos polocar a variável + metodo dentro de outra variável para melhorar a vizualização
		String dataFormatada1 = data1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());

		data1.ImprimirDataFormatada();
	}

}
