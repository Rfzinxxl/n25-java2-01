package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String custName="Alex";
		String itemDesc="camiseta";
		double preco = 5.00;
		double imposto = 18.00;
		int quantidade = 2;
		double totalPrice = preco * quantidade * (1 + imposto / 100);
		String message = custName + "quer comprar " + quantidade + " " + itemDesc + 
				"\nO Custo total com imposto é R$: " + Math.round(totalPrice*100)/100.;
		System.out.println(message);

	}

}