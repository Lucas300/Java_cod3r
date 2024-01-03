package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		//Wrappers são a versão obejeto dos tipos primitivos!
		//tudo em java é classe menos os tipos primitivos
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Long l = 10000L; //é Obrigatório colocar o L no final do numero
		Integer inteiro = 100000; //como se fosse o int 
		Boolean bo = Boolean.parseBoolean("true"); 
		
		/*
		System.out.printf("Digite um numero para ver a multiplicação por 2: ");
		Integer i = Integer.parseInt(entrada.next()); //recebendo e convertendo uma string em um valor inteiro
		*/
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(inteiro * 3);
		System.out.println(l * 3);
		
		Float f = 123.0f;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//exbindo o Boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //converto para string e posso usar o .toUpperCase
		
		Character c = '#';
		System.out.println(c.toString());
		
		entrada.close();
	}

}
