package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo05.class.getResourceAsStream("cadastro.csv"));
		sc.useDelimiter(",");
		for(int i=0;i<5;i++) {
			System.out.print(sc.next().replace("\"", "") + "\t");
		}
		System.out.println();
		while(sc.hasNext()) {
			System.out.print(Integer.parseInt(sc.next().replace("\r\n", "")));
			System.out.print("\t"+sc.next().replace("\"", ""));
			System.out.print("\t"+sc.nextInt());
			System.out.println("\t"+sc.next().replace("\"", ""));
		
		}
		sc.close();
	}

}
