package sample;

import java.util.ArrayList;

class Criterio1 implements Criterio_interface {
    private ArrayList<Ficha> ordem;
    private ArrayList<Ficha> fichas;
    private Ficha atual;
    private int pivo;

    public Criterio1(ArrayList<Ficha> fichas /*ArrayList<Ficha> ordem*/){
        //this.ordem = ordem;
        this.fichas = fichas;
        this.pivo = 0;
    }

    public Ficha puxarProximo(){
        Puxar();
        return atual;
    }

    @Override
    public void Puxar() {
        for (int i = pivo; i < ordem.size(); i++) {
            for (Ficha fichas_tipo : fichas) {
                if (fichas_tipo.getTipo().equals(ordem.get(i).getTipo())) {
                    pivo++;
                    if (pivo >= ordem.size()) {
                        pivo = 0;
                    }
                    fichas.remove(fichas_tipo);
                    atual = fichas_tipo;
                }
            }
        }
    }
}