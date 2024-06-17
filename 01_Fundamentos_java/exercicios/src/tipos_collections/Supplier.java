package Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	

	public class Main {
	    public static void main(String[] args) {
	        // Definição de um Supplier que fornece um número aleatório
	        java.util.function.Supplier<Double> randomSupplier = () -> Math.random();

	        // Usando o Supplier para gerar uma lista de números aleatórios
	        List<Double> randomNumbers = new ArrayList<>();
	        for (int i = 0; i < 5; i++) {
	            randomNumbers.add(randomSupplier.get());
	        }

	        // Imprimindo os números aleatórios gerados
	        randomNumbers.forEach(System.out::println);
	    }
	}

}
