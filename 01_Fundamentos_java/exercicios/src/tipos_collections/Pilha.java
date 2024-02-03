package tipos_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//ultimo a entrar é o primeiro a sair
		Deque<String> livros = new ArrayDeque<>();
		
		//adicionando elementos a pilha
		livros.add("O Pequeno Príncipe"); //retorna true or false
		livros.push("Don Quixote"); //gera exceção
		livros.push("O Hobbit");
		
		//exibindo proximo elemento da pilha 
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
			
		//excluindo os elementos da pilha
		System.out.println();
		System.out.println(livros.poll());
		System.out.println(livros.remove()); //rertorna ERRO caso não tenha proximo elemento
		
//		livros.isEmpty();
//		livros.size();
//		livros.contains("O Hobbit");
//		livros.isEmpty(); //verifica se esta vazia
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		
	}
}
