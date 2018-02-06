package aula_padroes_factory;

public class ComponenteConfortoFactory implements ComponenteFactoryInterface{

	@Override
	public Piso criarPiso() {
		// TODO Auto-generated method stub
        return new CeramicaEsmaltada();
	}

	@Override
	public Parede criarParede() {
		// TODO Auto-generated method stub
		return new Alvenaria();
	}

	@Override
	public Porta criarPorta() {
		// TODO Auto-generated method stub
		 return new Madeira();
	}

	@Override
	public Tinta criarTinta() {
		// TODO Auto-generated method stub
		return new Acrilica();
	}

	@Override
	public Metal criarMetal() {
		// TODO Auto-generated method stub
		return new Aluminio();
	}

	@Override
	public Louca criarLouca() {
		// TODO Auto-generated method stub
		return new Elizabeth();
	}

}
