package classe;

public class Data {
	int dia;
	int mes;
	int ano;

String obterDataFormatada() {
	String formato = (String)(dia+"/"+mes+"/"+ano);
	return formato;
}
}
