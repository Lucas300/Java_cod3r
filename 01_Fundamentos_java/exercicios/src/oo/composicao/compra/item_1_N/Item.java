package oo.composicao.compra.item_1_N;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item(String nome, int quantidade , double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
