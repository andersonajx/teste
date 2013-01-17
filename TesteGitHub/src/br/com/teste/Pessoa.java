package br.com.teste;

import br.com.teste.command.Command;

public class Pessoa {

	private String nome;
	
	private Pessoa(String nome) {
		this.nome = nome;
	}
	
	public static Pessoa newInstance(String nome) {
		return new Pessoa(nome);
	}
	
	public void escreverNome(Command<Pessoa> command) {
		command.execute(this);
	}
	
	public void inverterNome(Command<Pessoa> command) {
		command.execute(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
