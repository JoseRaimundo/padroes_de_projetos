package aula_composite_adapter;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposta implements Figura {
	private List<Figura> figuras;
	private String nome;
	
	public FiguraComposta(String nome){
		this.nome 			= nome;
		this.figuras = new ArrayList<>();
	}
	
	
	public void addFigura(Figura figura){
		this.figuras.add(figura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		String figs = "";
		for (Figura figura : this.figuras) {
			figs += figura + "\n";
		}
		return "FiguraComposta [figuras=" + figs + "]";
	}

	@Override
	public float perimetro() {
		float perimetor = 0;
		for (Figura figura : figuras) {
			perimetor += figura.perimetro();			
		}
		return perimetor;
		
	}

	@Override
	public float area() {
		float area = 0;
		for (Figura figura : figuras) {
			area += figura.area();			
		}
		return area;
	}

	@Override
	public void desenha() {
		System.out.println("Figura composta " + this.nome + ": ");
		for (Figura figura : figuras) {
			figura.desenha();			
		}		
	}	
}
