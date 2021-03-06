package br.com.teste.model;

import java.util.LinkedList;
import java.util.List;

import br.com.teste.command.Command;
import br.com.teste.listener.PessoaListener;
import br.com.teste.utils.CheckArguments;
import br.com.teste.utils.CheckNotNull;

public class Pessoa {

	private String nome;

	private List<PessoaListener> listeners = new LinkedList<>();

	private Pessoa(String nome) {
		this.nome = nome;
	}

	public void addPessoaListener(PessoaListener listener) {
		CheckNotNull.check(listener, "Listener nao pode ser nulo");
		listeners.add(listener);
	}

	private void firePessoaListener() {
		for (PessoaListener listener : listeners) {
			listener.onSetName(this);
		}
	}

	public static Pessoa newInstance(String nome) {
		validar(nome);
		return new Pessoa(nome);
	}

	private static void validar(String nome) {
		CheckNotNull.check(nome, "Nome nao pode ser nulo");
		CheckArguments.check(!nome.isEmpty(), "Nome nao pode ser vazio");
	}

	public void executar(Command<Pessoa> command) {
		command.execute(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		validar(nome);
		this.nome = nome;
		firePessoaListener();
	}
}
