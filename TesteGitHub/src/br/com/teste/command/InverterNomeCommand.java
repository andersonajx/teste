package br.com.teste.command;

import br.com.teste.model.Pessoa;

public class InverterNomeCommand implements Command<Pessoa> {

	@Override
	public void execute(Pessoa object) {
		StringBuilder novoNome = new StringBuilder(object.getNome());
		novoNome.reverse();
		
		object.setNome(novoNome.toString());
	}

}
