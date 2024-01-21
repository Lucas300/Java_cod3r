package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	Data(){
		 dia = 1;
		 mes = 1;
		 ano = 1970;
	}
	Data(int diaInicial, int mesInicial, int anoInicial){
		 dia = diaInicial;
		 mes = mesInicial;
		 ano = anoInicial;
	}

	String obterDataFormatada() {
		String formato = (String)(dia+"/"+mes+"/"+ano);
		//return String.format("%d/%d/%d", dia,mes,ano);
		return formato;
		}
	//não é viável mas da pra usar um método dentro de outro
	void ImprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	} 
}
