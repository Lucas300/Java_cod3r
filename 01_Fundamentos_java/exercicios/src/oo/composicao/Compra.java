package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//podemos usar essa maneira para associar o objeto com o item do arraylist
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
		//compra1.itens.add(new Item("Caderno", 18 , 18.79)); faz a mesma coisa
	}
	void adicionarItem(String nome,int quantidade,double preco) {
		this.adicionarItem(new Item(nome,quantidade,preco));
	}
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;			
		}
		return total;
	}
	
}
