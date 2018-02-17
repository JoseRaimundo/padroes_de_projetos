package factory_method;

public class RecantoDaVovo implements FornecedorDeBolo {

	@Override
	public Bolo criaBolo() {
		return new BoloDeNata();
	}

}
