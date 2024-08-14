package com.estudos.aula8.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listItems;
	
	public CarrinhoDeCompras() {
		this.listItems = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listItems.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> listItemParaRemover = new ArrayList<>();
		
		for (Item i : listItems) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				listItemParaRemover.add(i);
			}
		}
		
		listItems.removeAll(listItemParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		for (Item i : listItems) {
			double preco = i.getPreco();
			int quantidade = i.getQuantidade();
			double totalItem = preco * quantidade;
			valorTotal += totalItem;
		}
		
		return valorTotal;
	}
	
	public void obterItens() {
		System.out.println(this.listItems);
	}
	
	// Class MAIN
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Escova", 12.50, 2);
		carrinho.adicionarItem("Caneta", 2.80, 4);
		carrinho.adicionarItem("Creme Dental", 7.00, 3);
		carrinho.adicionarItem("Escova", 12.50, 2);
		carrinho.obterItens();
		carrinho.removerItem("escova");
		carrinho.obterItens();
		System.out.println(carrinho.calcularValorTotal());
	}
}
