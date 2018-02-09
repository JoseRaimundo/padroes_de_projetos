package aula_composite_adapter;

public class Circulo implements Figura{
	private float raio;
	
	public Circulo(float raio){
		this.raio = raio;
	}
	
	@Override
	public void desenha() {
		System.out.println("Circulo: ");		
		System.out.println("  ---   ");		
		System.out.println(" /   \\ ");	
		System.out.println("|     | ");	
		System.out.println(" \\___/  ");
		
	}
	@Override
	public float area() {
		return (float) (3.14*(raio*raio));
	}
	
	@Override
	public float perimetro() {
		return (float) (2 * 3.14 * raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
}
