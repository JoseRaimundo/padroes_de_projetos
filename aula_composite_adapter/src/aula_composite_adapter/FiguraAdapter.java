package aula_composite_adapter;

public class FiguraAdapter  implements Figura{

	private FiguraExtra figura_extra;
	
	public FiguraAdapter(FiguraExtra figura) {
		this.figura_extra = figura;
	}
		
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float area() {
		return this.figura_extra.area();
	}

	@Override
	public void desenha() {
		this.figura_extra.desenharFigura();
		
	}
	
	public void volume(){
		this.figura_extra.volume();
	}
	

}
