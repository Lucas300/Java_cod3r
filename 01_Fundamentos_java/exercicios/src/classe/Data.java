package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	//podemos usar o this nos para chamar métodos como um construtor chamando outro, para acessar um atributo,  this. para acessar Metodo, 
	Data(){
		/*dia = 1;
		  mes = 1; 
		  ano = 1970;
		  */
		this(1,1,1970);
		//this só pode dentro do metodo construtor
	}
	// usamos o this para diferenciar o parametro do contrutor
	// e os atributos do objeto, this.dia é faz parte do parametro do método  
	Data(int dia, int mes, int ano){
		 this.dia = dia;
		 this.mes = mes;
		 this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato,this.dia,mes,ano);
		}
	//não é viável mas da pra usar um método dentro de outro
	void ImprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	} 
}
