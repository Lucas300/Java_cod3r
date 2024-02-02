package tipos_collections;

import java.util.HashSet;
import java.util.Set;

public class Colecoes {
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é "+ conjunto.size());
		conjunto.add('x'); //ele não adiciona objetos repetidos
		
		System.out.println("Tamanho é "+ conjunto.size());
		
		//para remover.... ele retorna true ou false.
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é "+ conjunto.size());
		
		//para verificar se existe o objeto usamos o contains
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		
		// conjunto.addAll(nums);//somando os dois conjuntos //não mantem uma ordem
		conjunto.retainAll(nums); // ele retem o valores que são comuns entre os 2 conjutos que no caso é o numero 1 
		System.out.println(conjunto);
		
		conjunto.clear(); //limpa  a lista
		System.out.println(conjunto);
	}
}
