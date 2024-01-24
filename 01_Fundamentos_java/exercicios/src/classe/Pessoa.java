package classe;

public class Pessoa {
	String nome;
	double peso;
	
	// método comer, vai receber como parâmetro 
	// objeto da classe comida, peso da comida mas 
	// peso da pessoa, antes e depois de comer
	Pessoa(){
	}
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	double comer(Comida comida) {
		double pesoF = peso;
		pesoF += comida.pesoComida;
		return pesoF;
	}
	
}
