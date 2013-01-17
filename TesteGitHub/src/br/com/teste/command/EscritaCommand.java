package br.com.teste.command;

import br.com.teste.Pessoa;

public class EscritaCommand implements Command<Pessoa> {

	@Override
	public void execute(Pessoa object) {
		System.out.println("Command: " + object.getNome());
	}


}
