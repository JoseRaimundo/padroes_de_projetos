package factory_method;

public class SaborNordestino implements FornecedorDeBolo {

	@Override
	public Bolo criaBolo() {
		return new BoloBaeta();
	}

}
