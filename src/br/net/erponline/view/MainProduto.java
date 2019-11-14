package br.net.erponline.view;

import java.util.Locale;
import java.util.Scanner;

import br.net.erponline.model.entity.Produto;

public class MainProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		int movimentacao = 0;
		
		System.out.print("Digite o nome do produto: ");
		produto.setName(sc.next());
		System.out.print("\nDigite o valor unitário do produto: ");
		produto.setPrice(sc.nextDouble());
		System.out.print("\nDigite a quantidade do produto: ");
		produto.setQuantity(sc.nextInt());
		
		System.out.println(produto.toString());
		
		System.out.print("Digite a Retirada: ");
		movimentacao = sc.nextInt();

		produto.removeProducts(movimentacao);
		System.out.println(produto.toString());

		System.out.print("Digite a Adição: ");
		movimentacao = sc.nextInt();

		produto.addProducts(movimentacao);
		System.out.println(produto.toString());
	}
}