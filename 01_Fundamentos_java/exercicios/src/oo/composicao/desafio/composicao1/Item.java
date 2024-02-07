package oo.composicao.desafio.composicao1;

import oo.composicao.compra.item_1_N.Compra;

@SuppressWarnings("unused")
public class Item {
	Produto produto;
	int quantidade;

	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	
}
