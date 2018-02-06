package aula_padroes_factory;

import java.util.ArrayList;

public class Comodo {
	private int tipo;
	private Piso piso;
	private Tinta tinta;
	private ArrayList<Parede> paredes 	= new ArrayList<>();;
	private ArrayList<Porta> portas 	= new ArrayList<>();
	private ArrayList<Metal> metais		= new ArrayList<>();
	private ArrayList<Louca> loucas		= new ArrayList<>();
	
	public  Comodo(int tipo){
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public Tinta getTinta() {
		return tinta;
	}

	public void setTinta(Tinta tinta) {
		this.tinta = tinta;
	}

	public ArrayList<Parede> getParedes() {
		return paredes;
	}

	public void addParede(Parede parede) {
		this.paredes.add(parede);
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void addPortas(Porta porta) {
		this.portas.add(porta);
	}

	public ArrayList<Metal> getMetais() {
		return metais;
	}

	public void addMetal(Metal metal) {
		this.metais.add(metal);
	}

	public ArrayList<Louca> getLoucas() {
		return loucas;
	}

	public void addLouca(Louca louca) {
		this.loucas.add(louca);
	}
	
	@Override
	public String toString() {
		return "Comodo [tipo=" + tipo + ", piso=" + piso + ", tinta=" + tinta + ", paredes=" + paredes + ", portas="
				+ portas + ", metais=" + metais + ", loucas=" + loucas + "]";
	}	

}
