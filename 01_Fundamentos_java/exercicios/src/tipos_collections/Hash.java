package tipos_collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		//se o metodo hashCode  e equal estiver certo na classe. as pesquisas funcionaram 
		System.out.println(usuarios.contains(new Usuario("Guilherme")));
		
		
	}
}