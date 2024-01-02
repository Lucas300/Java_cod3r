package fundamentos;
public class TipoString {
	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(4));
		String s = "Boa tarde";
		//duas formas de concaternar = juntar varias Strings
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		
		//Rertorna com true or false
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		//retorna true or false mas ignora se a letra é maiúscula ou minúscula
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//retorna o tamanho da String
		System.out.println(s.length());
		
		//
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.897;
		
		// \n quebra linha
		
		//maneira facil de exibir uma frase, porem fica grande
		System.out.println("Nome:"+nome + "\n Sobrenome:"
		+sobrenome +"\n idade:"
		+idade + "\n Salario:"+salario);
		
		//podemos colocar toda a frase dentro de uma String
		String MaisUmaFrase = "Nome:"+nome + "\n Sobrenome:" +sobrenome +"\n idade:"
				+idade + "\n Salario:"+salario; 
		
		//podemos montar uma frase usando printf
		//  %s = substitui a variavel string 
		//  %d = substitui a variavel inteira 
		//  %.2f = substitui a variavel float e o .2 fala quantas casa decimais serão exibidas 
		System.out.printf("O senhor %s %s tem %d anos e ganha R$: %.2f  \n \n",nome,sobrenome,idade,salario);
		
		//outra maneira de colocar uma frase dentro de uma String
		String	frase = String.format("O senhor %s %s tem %d anos e ganha R$: %.2f",nome,sobrenome,idade,salario);
		System.out.println(frase);
	
	}

}
