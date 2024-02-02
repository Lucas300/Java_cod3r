package tipos_collections;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjuto_Homogenio {

	public static void main(String[] args) {
		// Definindo uma lista do tipo String, que recebe os valores em ordem usando o SortedSet e TreeSet
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("luca");
		listaAprovados.add("Pedro");
		
		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}

}
