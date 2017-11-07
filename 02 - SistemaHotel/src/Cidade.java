
public class Cidade {
	private String nome;

	public Cidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object cidade) {
		return nome != null ? nome.equals(cidade) : cidade == null;
	}

	@Override
	public String toString() {
		return "Cidade{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
