package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.next();
		sc.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite seu endereço: ");
		String endereço = sc.nextLine();
		System.out.println("Seu nome é " + nome);
		System.out.println("Seu endereço é: " + endereço);
		System.out.println("Sua idade é: " + idade);
		sc.close();

	}

}
