package br.com.teste.listener;

import br.com.teste.model.Pessoa;

public class EscritaNomePessoaListener implements PessoaListener {

	@Override
	public void onSetName(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
	}

}
