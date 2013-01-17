package br.com.teste.listener;

import br.com.teste.Pessoa;

public class FormalizacaoNomeListener implements PessoaListener {

	@Override
	public void aoExecutarCommand(Pessoa pessoa) {
		StringBuilder nome = new StringBuilder("");
		nome.append("Sr./Sra. ")
			.append(pessoa.getNome());
		pessoa.setNome(nome.toString());
	}

}
