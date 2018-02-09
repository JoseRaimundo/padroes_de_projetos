package aula_composite_adapter;

public class Losango implements FiguraExtra {
	
	private Reta a_b;
	private Reta b_c;
	private Reta c_d;
	private Reta d_a;
	
	public Losango(Reta a_b, Reta b_c, Reta c_d, Reta d_a ){
		this.a_b = a_b;
		this.b_c = b_c;
		this.c_d = c_d;
		this.d_a = d_a;
	}

	@Override
	public void desenharFigura() {
		System.out.println("Quadrado: ");		
		System.out.println("   ---------");		
		System.out.println("  /		  / ");		
		System.out.println(" / 		 /  ");	
		System.out.println("/_______/   ");
		
	}

	@Override
	public float area() {
		return (this.a_b.getTamanho() * c_d.getTamanho());
	}

	@Override
	public float volume() {
		System.out.println("Volume do losango: " + (this.a_b.getTamanho() * c_d.getTamanho()));
		return 0;
	}
	
	@Override
	public String toString() {
		return "Losango [a_b=" + a_b + ", b_c=" + b_c + ", c_d=" + c_d + ", d_a=" + d_a + "]";
	}	

}
