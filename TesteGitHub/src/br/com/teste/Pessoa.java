package br.com.teste;

import br.com.teste.command.Command;

public class Pessoa {

	private String nome;
	
	private Pessoa(String nome) {
		this.nome = nome;
	}
	
	public static Pessoa newInstance(String nome) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser nulo");
		}
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
	}
}
