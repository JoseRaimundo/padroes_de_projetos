import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Cadastra cidade");
		Controller.cadastraCidade("Guarabira");

		System.out.println("Cadastra hotel");
		Controller.cadastraHotel("Hotel Bela Vista", "Guarabira", 10, 8.0 );
		Controller.cadastraHotel("Hotel Miragem", "Guarabira", 11, 9.0 );
		Controller.cadastraHotel("Hotel Paraíba", "Guarabira", 07, 8.5 );
		Controller.cadastraHotel("Hotel Lua Nova", "Guarabira", 22, 6.0 );
		Controller.cadastraHotel("Hotel Pinta do Mar", "Guarabira", 10, 10 );

		System.out.println("Cadastra preços");
		Controller.cadastraPreco("Hotel Bela Vista", TipoQuarto.SINGLE, 500);
		Controller.cadastraPreco("Hotel Bela Vista", TipoQuarto.DUPLO, 600);
		Controller.cadastraPreco("Hotel Bela Vista", TipoQuarto.TRIPLO, 700);
		Controller.cadastraPreco("Hotel Bela Vista", TipoQuarto.PRESIDENCIAL, 900);

		Controller.cadastraPreco("Hotel Miragem", TipoQuarto.SINGLE, 500);
		Controller.cadastraPreco("Hotel Miragem", TipoQuarto.DUPLO, 600);
		Controller.cadastraPreco("Hotel Miragem", TipoQuarto.TRIPLO, 700);
		Controller.cadastraPreco("Hotel Miragem", TipoQuarto.PRESIDENCIAL, 900);

		Controller.cadastraPreco("Hotel Paraíba", TipoQuarto.SINGLE, 500);
		Controller.cadastraPreco("Hotel Paraíba", TipoQuarto.DUPLO, 600);
		Controller.cadastraPreco("Hotel Paraíba", TipoQuarto.TRIPLO, 700);
		Controller.cadastraPreco("Hotel Paraíba", TipoQuarto.PRESIDENCIAL, 900);

		Controller.cadastraPreco("Hotel Lua Nova", TipoQuarto.SINGLE, 2500);
		Controller.cadastraPreco("Hotel Lua Nova", TipoQuarto.DUPLO, 2600);
		Controller.cadastraPreco("Hotel Lua Nova", TipoQuarto.TRIPLO, 2700);
		Controller.cadastraPreco("Hotel Lua Nova", TipoQuarto.PRESIDENCIAL, 2900);

		Controller.cadastraPreco("Hotel Pinta do Mar", TipoQuarto.SINGLE, 1500);
		Controller.cadastraPreco("Hotel Pinta do Mar", TipoQuarto.DUPLO, 1600);
		Controller.cadastraPreco("Hotel Pinta do Mar", TipoQuarto.TRIPLO, 1700);
		Controller.cadastraPreco("Hotel Pinta do Mar", TipoQuarto.PRESIDENCIAL, 1900);


		System.out.println("Cadastra Quarto");
		Controller.cadastraQuarto("Hotel Bela Vista",  TipoQuarto.SINGLE);
		Controller.cadastraQuarto("Hotel Bela Vista",  TipoQuarto.DUPLO);
		Controller.cadastraQuarto("Hotel Bela Vista",  TipoQuarto.SINGLE);
		Controller.cadastraQuarto("Hotel Miragem", TipoQuarto.PRESIDENCIAL);
		Controller.cadastraQuarto("Hotel Miragem",  TipoQuarto.SINGLE);
		Controller.cadastraQuarto("Hotel Bela Vista", TipoQuarto.TRIPLO);
		Controller.cadastraQuarto("Hotel Lua Nova",  TipoQuarto.SINGLE);
		Controller.cadastraQuarto("Hotel Lua Nova",  TipoQuarto.PRESIDENCIAL);
		Controller.cadastraQuarto("Hotel Paraíba", TipoQuarto.SINGLE);
		Controller.cadastraQuarto("Hotel Bela Vista",  TipoQuarto.DUPLO);
		Controller.cadastraQuarto("Hotel Paraíba",  TipoQuarto.TRIPLO);
		Controller.cadastraQuarto("Hotel Pinta do Mar",  TipoQuarto.PRESIDENCIAL);


		System.out.println("Hoteis ordenados pela distancia até o centro");
		System.out.println(Controller.ordenadoDistancia());

		System.out.println("Contrata hotel");
		Controller.contrataQuarto("Hotel Miragem", "0", TipoQuarto.SINGLE, "03/07/2018", "07/07/2018" );
		Controller.contrataQuarto("Hotel Bela Vista", "0", TipoQuarto.PRESIDENCIAL, "05/07/2018", "10/07/2018" );
		System.out.println("Lista contratos");
		System.out.println(Controller.listaContratos());

	}

}
