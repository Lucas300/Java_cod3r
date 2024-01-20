package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	//podemos ter metodos com o mesmo nome mas com parâmetros diferentes
	double precoComDesconto() { //parâmetro só se for acessar atributos de fora da classe
		return preco*(1-desconto);
	}
	double precoComDesconto(double descontoDoGerente) { //parâmetro só se for acessar atributos de outra classe
		return preco*(1-desconto + descontoDoGerente);
	}
}
