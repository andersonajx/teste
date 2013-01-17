package br.com.teste.listener;

import br.com.teste.Pessoa;

public class FormalizacaoNomeListener implements PessoaListener {

	@Override
	public void aoExecutar(Pessoa pessoa) {
		StringBuilder novoNome = new StringBuilder(pessoa.getNome());
		novoNome.insert(0, "Sr./Sra. ");
		pessoa.setNome(novoNome.toString());
	}

}
