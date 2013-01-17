package br.com.teste.command;

public interface Command<T> {

	void execute(T object);
	
}
