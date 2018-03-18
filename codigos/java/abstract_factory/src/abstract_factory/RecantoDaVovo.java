package abstract_factory;

public class RecantoDaVovo implements FornecedorDeBolo {

	@Override
	public BoloNormal criaBoloNormal() {
		return new BoloDeNata();
	}

	@Override
	public BoloDiet criaBoloDiet() {
		return new BoloDeAveia();
	}

}
