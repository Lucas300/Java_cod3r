package classe;

public class DataTeste {

	public static void main(String[] args) {
		var data1 = new Data();
		data1.ano = 2000;
		data1.dia =13;
		data1.mes = 4;
		
		Data data2 = new Data();
		data2.ano = 1980;
		data2.dia = 11;
		data2.mes = 7;
		
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());

	}

}
