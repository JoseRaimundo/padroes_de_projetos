package aula_composite_adapter;

public class TriaguloEscaleno extends Triangulo {

	public TriaguloEscaleno(Reta a_b, Reta b_c, Reta c_a) {
		super(a_b, b_c, c_a);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void desenha() {
		System.out.println("Triagulo isósceles: ");		
		System.out.println("      /|   ");		
		System.out.println("    /..|  ");		
		System.out.println("  /....| ");	
		System.out.println("/______|");
	}

}
