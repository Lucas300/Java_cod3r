package tipos_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		//estrutura chave valor
		Map<Integer, String> usuarios = new HashMap<>();
		
		//adicionar (ele substitui caso o novo valor ja exista)
		usuarios.put(1,"Roberto"); //não existe add. ao Map
		usuarios.put(20,"Ricardo");
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet()); //ele pega as chaves , mas não as coloca em ordem crescente
		System.out.println(usuarios.values()); //pegar os valores(nesse caso os nomes)
		System.out.println(usuarios.entrySet()); //retorar tudo as chaves e os valores
		
		System.out.println(usuarios.containsKey(20));//verifica por chave
		System.out.println(usuarios.containsValue("Rebeca")); //verifica por valores
		System.out.println(usuarios.get(20)); //retorna o valor/nome do usuario que tem a chave 20
		
		//exibe as chaves 1 , 20, 3, 4
		for (int valor : usuarios.keySet()) {
			System.out.println(valor);
		}
		//exibe os valores Roberto, ricardo , Rafaela.....
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		// exibe tanto a chave tanto o nome dos usuarios
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
//			System.out.println(registro); tambem funciona e ja exibe os 2
			System.out.print(registro.getKey()+" ");
			System.out.println(registro.getValue());
		}
	}

}
