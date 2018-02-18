package builder;

public abstract class BoloBuilder {
	protected Bolo bolo;
	public BoloBuilder() {
		this.bolo = new Bolo();
	}
	
	public abstract void buildNome();
	public abstract void buildMassa();
	public abstract void buildRecheio();
	public abstract void buildCobertura();
	
	public Bolo getBolo() {
		return this.bolo;
	}
}
