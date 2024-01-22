package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		//construtor com parâmetros
		Produto p1 = new Produto("Notebook",4356.89);
		
		//contrutor padrão, sem receber parâmetros
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);

		Produto.desconto = 0.34;
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precofinal1 + precofinal2 )/2;
		System.out.printf("Média do carrinho = R$%.2f ", mediaCarrinho);
		
	}

}
