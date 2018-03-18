package abstract_factory;

public class Teste {
	public static void main(String[] args) {
		FornecedorDeBolo fornecedor = new RecantoDaVovo();
		fornecedor = new RecantoDaVovo();
		BoloDiet bolo_diet = fornecedor.criaBoloDiet();
		BoloNormal bolo_normal = fornecedor.criaBoloNormal();
		bolo_diet.descricaoBoloDiet();
		bolo_normal.descricaoBolNormal();
		
		fornecedor = new SaborNordestino();
		bolo_diet = fornecedor.criaBoloDiet();
		bolo_normal = fornecedor.criaBoloNormal();
		
		bolo_diet.descricaoBoloDiet();
		bolo_normal.descricaoBolNormal();
		
		
	}
}
