package aula_padroes_factory;

public class ComponenteBasicoFactory implements ComponenteFactoryInterface {

	@Override
	public Piso criarPiso() {
		// TODO Auto-generated method stub
		return new Ceramica();
	}

	@Override
	public Parede criarParede() {
		// TODO Auto-generated method stub
		return new Gesso();
	}

	@Override
	public Porta criarPorta() {
		// TODO Auto-generated method stub
		return new Mdf();
	}

	@Override
	public Tinta criarTinta() {
		// TODO Auto-generated method stub
		return new Latex();
	}

	@Override
	public Metal criarMetal() {
		// TODO Auto-generated method stub
		return new Ferro();
	}

	@Override
	public Louca criarLouca() {
		// TODO Auto-generated method stub
		return new BarataDoMercado();
	}

}
