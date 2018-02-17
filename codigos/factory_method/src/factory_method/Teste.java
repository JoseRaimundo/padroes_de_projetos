package factory_method;

public class Teste {
	public static void main(String[] args) {
		FornecedorDeBolo fornecedor = new RecantoDaVovo();
		Bolo bolo = fornecedor.criaBolo();
		bolo.descricao();
		
		fornecedor 	= new JoaoBolos();
		bolo = fornecedor.criaBolo();
		bolo.descricao();
		
		fornecedor = new SaborNordestino();
		bolo = fornecedor.criaBolo();
		bolo.descricao();		
	}	
}
