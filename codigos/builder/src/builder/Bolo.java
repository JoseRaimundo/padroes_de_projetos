package builder;

public class Bolo {
	private String nome;
	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Bolo [nome=" + nome + ", massa=" + massa + ", recheio=" + recheio + ", cobertura=" + cobertura + "]";
	}
	
	
	
}
