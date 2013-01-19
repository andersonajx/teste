package br.com.teste;

public final class Teste {

	final String teste;
	
	private Teste(String teste) {
		this.teste = teste;
	}
	
	public static Teste newInstance(String teste) {
		if (teste == null) {
			testeErrorException();
		}
		return new Teste(teste);
	}

	private static void testeErrorException() {
		throw new IllegalArgumentException("Teste nao pode ser nulo!");
	}
	
}
