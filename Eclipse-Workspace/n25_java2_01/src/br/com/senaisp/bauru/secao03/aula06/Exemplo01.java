package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, "Olá," + nome + ", tudo bem?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		JOptionPane.showMessageDialog(null, "Sua idade no ano que vem será " + (idade + 1));

	}

}


