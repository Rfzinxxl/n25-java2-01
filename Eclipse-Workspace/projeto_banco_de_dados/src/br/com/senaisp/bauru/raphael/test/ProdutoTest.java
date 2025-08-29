package br.com.senaisp.bauru.raphael.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.senaisp.bauru.raphael.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		try {
			Produto prd = Produto.create("Produto xpto", 5.0, 15.20);
			System.out.println("Produto");
			List<Produto> lista = Produto.listarProdutos();
			for(Produto prod: lista) {
				System.out.println(prod.getDescricao() + " - " + prod.getId());
			}
			System.out.println("Informe o id a ser pesquisado: ");
			Scanner sc = new Scanner(System.in);
			int pId = sc.nextInt();
			prd = Produto.consultarProdutoPorId(pId);
			if(prd != null) {
				System.out.println("Produto: " + prd.getDescricao());
				prd.setDescricao("Produto alterado - XPTO");
				prd.setPreco(15.90);
				prd.atualizarBanco();
			}
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
