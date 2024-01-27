package arrays;

public class Foreach {
	public static void main(String[] args) {
		double notas[] = {9.9,8.7,7.2,9.4};
	/// ele percorre todo o array e atribui o 
    //valor de cada array dentro da variável nota 
	for (double nota : notas) {
		System.out.print(nota+ " ");
	}
	System.out.println();
	
	for (int i = 0; i < notas.length; i++) {
		System.out.print(notas[i]+" ");
	}

	}

}
