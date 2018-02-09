package aula_composite_adapter;

public class TrianguloIsosceles extends Triangulo {
	

	public TrianguloIsosceles(Reta a_b, Reta b_c, Reta c_a) {
		super(a_b, b_c, c_a);
	}

	@Override
	public void desenha() {
		System.out.println("Triagulo isósceles: ");		
		System.out.println("   /\\  ");		
		System.out.println("  /..\\ ");		
		System.out.println(" /....\\");	
		System.out.println("/______\\");
	}

}
