package builder;

public class RecantoDaVovoBuilder extends BoloBuilder{

	@Override
	public void buildNome() {
		this.bolo.setNome("Bolo de cenoura");		
	}

	@Override
	public void buildMassa() {
		this.bolo.setMassa("Diet");
	}

	@Override
	public void buildRecheio() {
		this.bolo.setRecheio("Morango");
	}

	@Override
	public void buildCobertura() {
		this.bolo.setCobertura("Coco");
	}

}
