package aula_composite_adapter;

public class Manipulacao {
	public static void main(String args[]){
		Figura c = new Circulo(2);
		
		System.out.println("Circulo:");
		System.out.println("Area	: "+c.area());
		System.out.println("Perimetro: " + c);
		c.desenha();
		

		Figura t = new TriaguloEscaleno(new Reta(3), new Reta(3), new Reta(2));
		
		System.out.println("Triagulo:");
		System.out.println("Area	: "+ t.area());
		System.out.println("Perimetro: " + t);
		t.desenha();
		
		Figura q = new FiguraAdapter( new Quadrado(new Reta(2), new Reta(2), new Reta(2), new Reta(2)));
		
		System.out.println("Quadrado:");
		System.out.println("Area	: "+ q.area());
		System.out.println("Perimetro: " + q);
		q.desenha();
		
		
		
		FiguraComposta fc = new FiguraComposta("Tangamandapio");
		fc.addFigura(c);
		fc.addFigura(t);
		fc.addFigura(q);
		
		System.out.println("Triagulo:");
		System.out.println("Area	: "+ fc.area());
		System.out.println("Perimetro: " + fc);
		fc.desenha();
	}

}
