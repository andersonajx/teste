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
	
	public static Pessoa newInstance(String nome) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser nulo");
		}
		return new Pessoa(nome);
	}
	
	public void addPessoaListener(PessoaListener listener) {
		if (listener == null) {
			throw new NullPointerException("PessoaListener nao pode ser nulo");
		}
		listeners.add(listener);
	}
	
	public void executar(Command<Pessoa> command) {
		command.execute(this);
		firePessoaListeners();
	}
	
	private void firePessoaListeners() {
		for (PessoaListener listener : listeners) {
			listener.aoExecutarCommand(this);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
