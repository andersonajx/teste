/**
 * Exemplo de Endereco com Builder
 */

public final class Endereco implements Serializable {

	String endereco;
	String bairro;
	String cidade;
	Estado estado;
	int numero;
	Cep cep;
	
	private Endereco(Builder builder) {
		endereco = builder.endereco;
		numero = builder.numero;
		bairro = builder.bairro;
		cep = builder.cep;
		cidade = builder.cidade;
		estado = builder.estado;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Endereco) {
			Endereco other = (Endereco) obj;
			return Objects.equal(endereco, other.endereco)
					&& Objects.equal(numero, other.numero)
					&& Objects.equal(bairro, other.bairro)
					&& Objects.equal(cidade, other.cidade)
					&& Objects.equal(estado, other.estado);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(endereco, numero, cidade, estado);
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("endereco", endereco).add("numero", numero)
				.add("bairro", bairro).add("cidade", cidade).add("estado", estado).toString();
	}
	
	public static final class Builder {
		
		int numero;
		String endereco;
		String bairro;
		String cidade;
		Estado estado;
		Cep cep;
		
		private Builder() {
		}
		
		public Builder withEndereco(String endereco) {
			checkNotNull(endereco, "Endereco nao pode ser nulo");
			this.endereco = endereco;
			return this;
		}
		
		public Builder withNumero(int numero) {
			checkArgument(numero > 0, "Numero nao pode ser negativo");
			this.numero = numero;
			return this;
		}
		
		public Builder withBairro(String bairro) {
			checkNotNull(bairro, "Bairro nao pode ser nulo");
			this.bairro = bairro;
			return this;
		}
		
		public Builder withCep(Cep cep) {
			checkNotNull(cep, "CEP nao pode ser nulo");
			this.cep = cep;
			return this;
		}
		
		public Builder withCidade(String cidade) {
			checkNotNull(cidade, "Cidade nao pode ser nulo");
			this.cidade = cidade;
			return this;
		}
		
		public Builder withEstado(Estado estado) {
			checkNotNull(estado, "Estado nao pode ser nulo");
			this.estado = estado;
			return this;
		}
		
		public Endereco build() {
			checkArgument(endereco != null, "Endereco nao pode ser nulo");
			checkArgument(bairro != null, "Bairro nao pode ser nulo");
			checkArgument(cidade != null, "Cidade nao pode ser nulo");
			checkArgument(estado != null, "Estado nao pode ser nulo");
			return new Endereco(this);
		}
	}
	
}
