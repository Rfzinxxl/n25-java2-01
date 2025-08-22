package br.com.senaisp.bauru.secao08.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		int b = sc.nextInt();
			System.out.println(a/b);
			
		}catch(ArithmeticException e){
			System.out.println("erro d / zero");
		}catch(InputMismatchException e) {
			System.out.println("o valr dv ser int");
			
		}catch(Exception e) {
			System.out.println("error 404" + e.getMessage());
		}
		
			
		
		System.out.println("dadad");

	}
	public static void dividirValores(int a, int b) {
		if(b==0) {
			throw new RuntimeException("O valor de B deve ser" + " maior ou menos que zero!");
		}
		System.out.println(a/b);
	}
	}




