package oo.composicao.desafio.composicao1;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p,quantidade));
	}
	void adicionarItem(String nome, double preco, int quantidade){
		var produto = new Produto(nome,preco);
		this.itens.add(new Item(produto,quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total = total + (item.quantidade * item.produto.preco);
		}
		return total;
	}
	}
	

