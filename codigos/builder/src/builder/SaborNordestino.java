package builder;

public class SaborNordestino extends BoloBuilder{

	@Override
	public void buildNome() {
		this.bolo.setNome("Bolo de Ovo");		
	}

	@Override
	public void buildMassa() {
		this.bolo.setMassa("Normal");
	}

	@Override
	public void buildRecheio() {
		this.bolo.setRecheio("Brigadeiro");
	}

	@Override
	public void buildCobertura() {
		this.bolo.setCobertura("Chocolate");
	}
}
