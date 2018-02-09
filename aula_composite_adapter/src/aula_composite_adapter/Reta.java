package aula_composite_adapter;

public class Reta {
	private float tamanho;
	
	

	public Reta(float tamanho) {
		super();
		this.tamanho = tamanho;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Reta [tamanho=" + tamanho + "]";
	}	
}
