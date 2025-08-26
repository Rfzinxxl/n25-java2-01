package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {
	public PessoaFisica() {
		super();
		setTipoPessoa('F');
	}
	public PessoaFisica (String nom, String doc, String ende, String dtNas) throws Exception {
	super(nom, doc, ende, dtNas);
	setTipoPessoa('F');

}
	@Override
	protected boolean isDocumentoValido(String documento2) {
		// TODO Auto-generated method stub
		return documento2.length()==14 || documento2.length()==11;
	}
	@Override
	protected boolean isEnderecoValido(String endereco2) {
		// TODO Auto-generated method stub
		return false;
	}
}
