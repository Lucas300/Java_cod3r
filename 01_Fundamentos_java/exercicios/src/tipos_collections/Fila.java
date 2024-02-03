package tipos_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		// Offer e add -> adicionam um elemento a fila
		fila.add("Ana");   //retorna uma exceção
		fila.offer("Bia"); // retorna um boolean 
		fila.add("Carlos");  
		fila.offer("Daniel");  
		fila.add("Rafaela");  
		fila.offer("Gui");  
		
		//exibem o proximo da fila que no caso o primeiro a chegar é o primeiro a sair
		System.out.println(fila.peek());//se não tiver um elemento retorna NULL
		System.out.println(fila.peek());
		System.out.println(fila.element()); //se não tiver um elemento retorna uma exceção
	
		
		//exibem e removem da lista
		System.out.println(fila.remove()); // causa uma exceção/erro
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());//ele retorna o proximo elemento da lista e exclui 
		System.out.println(fila.poll()); // caso não tenha proximo, ele retorna NULL 
		
		
		
		// fila.size(); //tamanho
		// fila.clear(); //limpa a fila 
			
		// fila.isEmpty(); // verifica se a fila esta vazia
		// fila.contains("Lucas"); // verifica se a fila contem Lucas 
		
		
		
		
	}
}
