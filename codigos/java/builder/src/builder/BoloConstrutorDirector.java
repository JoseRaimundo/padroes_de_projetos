package builder;

public class BoloConstrutorDirector {
	public BoloBuilder fornecedor;
	public BoloConstrutorDirector(BoloBuilder fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void construirBolo() {
		this.fornecedor.buildNome();
		this.fornecedor.buildMassa();
		this.fornecedor.buildRecheio();
		this.fornecedor.buildCobertura();
	}
	
	public Bolo getBolo() {
		return this.fornecedor.getBolo();
	}
}
