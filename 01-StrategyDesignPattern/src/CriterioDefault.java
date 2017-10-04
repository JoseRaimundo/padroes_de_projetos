import java.util.ArrayList;

class CriterioDefault implements CriterioInterface {
    private ArrayList<Ficha> fichas;

    public CriterioDefault(ArrayList<Ficha> fichas){
        this.fichas = fichas;
    }

    @Override
    public Ficha puxarFicha() {
        if (fichas.size() > 0) {
            Ficha atual = fichas.get(0);
            fichas.remove(0);
            return atual;
        }
        return null;
    }
}