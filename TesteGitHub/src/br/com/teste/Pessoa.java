package br.com.teste;

import java.util.LinkedList;
import java.util.List;

import br.com.teste.command.Command;
import br.com.teste.listener.PessoaListener;

public class Pessoa {

	private String nome;

	private List<PessoaListener> listeners = new LinkedList<>();

	private Pessoa(String nome) {
		this.nome = nome;
	}

	public void addPessoaListener(PessoaListener listener) {
		listeners.add(listener);
	}

	private void firePessoaListener() {
		for (PessoaListener listener : listeners) {
			listener.onSetName(this);
		}
	}

	public static Pessoa newInstance(String nome) {
		return new Pessoa(nome);
	}

	public void executar(Command<Pessoa> command) {
		command.execute(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		firePessoaListener();
	}
}
