package sample;

import java.util.ArrayList;

class Criterio2 implements Criterio_interface {
    private ArrayList<Ficha> ordem = new ArrayList<Ficha>(){
        {
            add(new Ficha("NRE"));
            add(new Ficha("NRE"));
            add(new Ficha("NRE"));
            add(new Ficha("PRE"));
            add(new Ficha("PFE"));
            add(new Ficha("PFE"));
        }
    } ;

    private ArrayList<Ficha> fichas;
    private Ficha atual;
    private int pivo;


    public Criterio2(ArrayList<Ficha> fichas /*ArrayList<Ficha> ordem*/){
        //this.ordem = ordem;
        this.fichas = fichas;
        this.pivo = 0;
    }

    @Override
    public Ficha Puxar() {
        for (int i = pivo; i < ordem.size(); i++) {
            for (Ficha atual : fichas) {
                if (atual.getTipo().equals(ordem.get(i).getTipo())) {
                    pivo++;
                    if (pivo >= ordem.size()) {
                        pivo = 0;
                    }
                    fichas.remove(atual);
                    return atual;
                }
            }
        }
        return null;
    }
}