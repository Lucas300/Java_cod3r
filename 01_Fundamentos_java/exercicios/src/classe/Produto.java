package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() { //parâmetro só se for acessar atributos de outra classe
		return preco*(1-desconto);
	}
	double precoComDesconto(double descontoDoGerente) { //parâmetro só se for acessar atributos de outra classe
		return preco*(1-desconto + descontoDoGerente);
	}
}
