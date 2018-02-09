package aula_composite_adapter;

public class Triangulo implements  Figura{
	
	private Reta a_b;
	private Reta b_c;
	private Reta c_a;
	
	public Triangulo(Reta a_b, Reta b_c, Reta c_a ){
		this.a_b = a_b;
		this.b_c = b_c;
		this.c_a = c_a;
	}
	
//	private Ponto a;
//	private Ponto b;
//	private Ponto c;
//
//	
//	public Triangulo(Ponto a, Ponto b, Ponto c, Reta a_b, Reta b_c, Reta c_a ){
//		this.a =a ;
//		this.a = b;
//		this.c = c;
//		this.a_b = a_b;
//		this.b_c = b_c;
//		this.c_a = c_a;
//	}

	@Override
	public float perimetro() {
		float p = a_b.getTamanho() + b_c.getTamanho() + c_a.getTamanho();
		return p;
		
	}

	@Override
	public float area() {
		float area = 0;
		return area;
	}

	@Override
	public void desenha() {
		System.out.println("Triagulo Normal: ");		
		System.out.println("   /\\   ");		
		System.out.println("  /  \\  ");		
		System.out.println(" /    \\ ");	
		System.out.println("/______\\");
	}

	@Override
	public String toString() {
		return "Triangulo [a_b=" + a_b + ", b_c=" + b_c + ", c_a=" + c_a + "]";
	}
	
	
	
//	float descobre_altura(int a, int b, int c,int tipo){
//		float altura;
//		int perimetro;
//
//		if(tipo == 1){
//			altura = (a * sqrt(3)) / 2;
//		}else if(tipo == 2){
//			if(a == b)	{
//				altura = sqrt(pow(a,2) - pow(c,2) / 4);
//			}else if(a == c){
//				altura = sqrt(pow(a,2) - pow(b,2) / 4);
//			}else{
//				altura = sqrt(pow(b,2) - pow(a,2) / 4);
//			}
//		}else{
//			perimetro = a + b + c;
//			altura = sqrt(perimetro * (perimetro - a) * (perimetro -  * (perimetro - c));
//		}
//
//		return(altura);
//	}
	

}
