package aula_padroes_factory;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Comodo> comodos = new ArrayList<Comodo>();;
	private ComponenteFactoryInterface comopnete_factory;
	
	
	public Casa(ComponenteFactoryInterface comopnete_factory) {
		this.comopnete_factory = comopnete_factory;
	}
	
	public void criaComodo(int tipo, int quantidade_paredes, int quantidade_portas, int quantidade_metais, int quantidade_loucas){
		Comodo comodo = new Comodo(tipo);
        comodo.setPiso(comopnete_factory.criarPiso());
        comodo.setTinta(comopnete_factory.criarTinta());
        addPorta(quantidade_portas, comodo);
        addLouca(quantidade_loucas, comodo);
        addParede(quantidade_paredes, comodo);
        addMetal(quantidade_metais, comodo);
        this.comodos.add(comodo);
	}
	
	  private void addMetal(int quantidade_metais, Comodo comodo) {
	        for (int i = 0; i < quantidade_metais; i++) {
	            comodo.addMetal(comopnete_factory.criarMetal());
	        }
	    }
	  
	  private void addParede(int quantidade_paredes, Comodo comodo) {
	        for (int i = 0; i < quantidade_paredes; i++) {
	            comodo.addParede(comopnete_factory.criarParede());
	        }
	    }

	  private void addLouca(int quantidade_loucas, Comodo comodo){
	        for (int i = 0; i < quantidade_loucas; i++) {
	            comodo.addLouca(comopnete_factory.criarLouca());
	        }
	    }

	  
	    private void addPorta(int quantidade_portas, Comodo comodo){
	        for (int i = 0; i < quantidade_portas; i++) {
	            comodo.addPortas(comopnete_factory.criarPorta());
	        }
	    }

	   

		@Override
		public String toString() {
			return "Casa [comodos=" + comodos + ", comopnete_factory=" + comopnete_factory + "]";
		}

}
