package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuição por valor(tipo primitivo)
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2022);
		Data d2 = d1;//atribuição por referência(objeto);
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarParaValorPadrao(d1);
		
		//um Objeto aponta para o outro e os valores continuam o mesmo
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	//metodo void só chama void
	//fazendo um metodo que recebe um objeto como parâmetro 
	static void voltarParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
