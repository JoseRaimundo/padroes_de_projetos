package factory_method;

public class JoaoBolos implements FornecedorDeBolo {

	@Override
	public Bolo criaBolo() {
		return new BoloDeOvo();
	}

}
