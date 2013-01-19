package br.com.teste.utils;

public abstract class CheckNotNull {

	private CheckNotNull() {
	}

	public static void check(Object object, String message) {
		if (object == null) {
			throw new NullPointerException(message);
		}
	}
}
