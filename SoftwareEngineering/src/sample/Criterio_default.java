package sample;

import java.util.ArrayList;

class Criterio_default implements Criterio_interface {
    private ArrayList<Ficha> fichas;

    public Criterio_default(ArrayList<Ficha> fichas){
        this.fichas = fichas;
    }

    @Override
    public Ficha Puxar() {
        if (fichas.size() > 0) {
            Ficha atual = fichas.get(0);
            fichas.remove(0);
            return atual;
        }
        return null;
    }
}