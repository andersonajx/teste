package br.com.teste;

public interface Command<T> {

	void execute(T object);
	
}
