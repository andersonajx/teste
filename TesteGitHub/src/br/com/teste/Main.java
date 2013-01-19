package br.com.teste;

import br.com.teste.command.EscritaCommand;
import br.com.teste.command.InverterNomeCommand;
import br.com.teste.listener.EscritaNomePessoaListener;

public final class Main {

	public static void main(String[] args) {
		Pessoa pessoa = Pessoa.newInstance("Fulano da Silva");
		pessoa.addPessoaListener(new EscritaNomePessoaListener());

		pessoa.escreverNome(new EscritaCommand());
		pessoa.inverterNome(new InverterNomeCommand());
		pessoa.escreverNome(new EscritaCommand());

		pessoa.setNome("Sicrano de Oliveira");
	}

}
