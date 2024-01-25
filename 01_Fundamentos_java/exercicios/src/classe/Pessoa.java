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
	void comer(Comida comida) {
		this.peso += comida.pesoComida;
	}
	String apresentar() {
		return "O " + nome + " tinha o peso de:" + peso + " Kg";
	}
	
}
