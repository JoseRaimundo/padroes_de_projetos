package aula_padroes_factory;

public interface ComponenteFactoryInterface {
    public Piso criarPiso();
    public Parede criarParede();
    public Porta criarPorta();
    public Tinta criarTinta();
    public Metal criarMetal();
    public Louca criarLouca();
}
