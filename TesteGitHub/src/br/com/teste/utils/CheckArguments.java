package br.com.teste.utils;

public abstract class CheckArguments {

	private CheckArguments() {
	}

	public static void check(boolean argument, String message) {
		if (!argument) {
			throw new IllegalArgumentException(message);
		}
	}

}
