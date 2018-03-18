package builder;

public class Teste {
	public static void main(String[] args) {
		BoloBuilder fornecedor = new RecantoDaVovoBuilder();
		BoloConstrutorDirector construtor = new BoloConstrutorDirector(fornecedor);
		
		construtor.construirBolo();
		Bolo bolo = construtor.getBolo();
		System.out.println(bolo);
		
		fornecedor = new SaborNordestino(); 
		construtor = new BoloConstrutorDirector(fornecedor);
		construtor.construirBolo();
		bolo = construtor.getBolo();
		System.out.println(bolo);		
	}
}
