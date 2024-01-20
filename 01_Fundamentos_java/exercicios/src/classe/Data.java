package classe;

public class Data {
	int dia;
	int mes;
	int ano;

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
