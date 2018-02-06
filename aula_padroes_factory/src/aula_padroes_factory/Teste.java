package aula_padroes_factory;

public class Teste {
	public static void main(String args[]){
		
		int sala = 0, quarto = 1, banheiro = 3;
		Casa casa;
		
		ComponenteFactoryInterface componentes;
		
		System.out.println("Criando uma casa básica");
		
		componentes = new ComponenteBasicoFactory();
		casa = new Casa(componentes);	
		// tipo, quantidade_paredes,  quantidade_portas,quantidade_metais, quantidade_loucas){
		casa.criaComodo(quarto, 4, 2, 2, 2);
        casa.criaComodo(banheiro, 4, 1, 1, 2);
        
        System.out.println(casa);
        
        System.out.println("Criando uma casa Conforto");
		
		componentes = new ComponenteConfortoFactory();
		casa = new Casa(componentes);	
		// tipo, quantidade_paredes,  quantidade_portas,quantidade_metais, quantidade_loucas){
		casa.criaComodo(sala, 4, 2, 2, 2);
        casa.criaComodo(quarto, 4, 1, 1, 2);
        
        System.out.println(casa);
		
	}

}
