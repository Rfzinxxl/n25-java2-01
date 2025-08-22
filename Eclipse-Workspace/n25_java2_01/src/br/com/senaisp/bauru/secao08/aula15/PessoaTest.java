package br.com.senaisp.bauru.secao08.aula15;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pe01 = new PessoaFisica();
		Pessoa pe02 = new PessoaJuridica();
		pe01.setNome("Joao pé de feijão");
		pe01.setEndereco("Ruadas Ruas, 1234");
		try {
			pe01.setDocumento("123.456.789-09");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe01.setDataNascimento("20/05/1999");
		pe02.setNome("Miza Black");
		pe02.setEndereco("Ruadas Ruas, 357");
		try {
			pe02.setDocumento("123.456.789-00");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe02.setDataNascimento("20/05/1967");
		
		System.out.println(pe01 + "\n" + pe02);
		//System.out.println(pe02);
	}

}
