package abstract_factory;

public class SaborNordestino implements FornecedorDeBolo {

	@Override
	public BoloNormal criaBoloNormal() {
		return new BoloBaeta();
	}

	@Override
	public BoloDiet criaBoloDiet() {
		return new BoloDeCenoura();
	}
	
}
