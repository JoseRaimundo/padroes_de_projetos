package sample;

import java.util.ArrayList;

class Criterio_default implements Criterio_interface {
    private ArrayList<Ficha> fichas;
    private Ficha atual;

    public Criterio_default(ArrayList<Ficha> fichas){
        this.fichas = fichas;
    }

    public Ficha puxarProximo(){
        Puxar();
        return atual;
    }

    @Override
    public void Puxar() {
        if (fichas.size() > 0)
            atual = fichas.get(0);
        fichas.remove(atual);
    }
}