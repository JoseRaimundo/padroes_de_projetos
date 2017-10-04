import java.util.ArrayList;

class Criterio1 implements CriterioInterface {
    private ArrayList<Ficha> ordem = new ArrayList<Ficha>(){
        {
            add(new Ficha("NRE"));
            add(new Ficha("NRE"));
            add(new Ficha("NRE"));
            add(new Ficha("NFE"));
        }
    } ;

    private ArrayList<Ficha> fichas;
    private Ficha atual;
    private int pivo;


    public Criterio1(ArrayList<Ficha> fichas /*ArrayList<Ficha> ordem*/){
        //this.ordem = ordem;
        this.fichas = fichas;
        this.pivo = 0;
    }

    @Override
    public Ficha puxarFicha() {
        for (int i = pivo; i < ordem.size(); i++) {
            for (Ficha atual : fichas) {
                if (atual.getTipo().equals(ordem.get(i).getTipo())) {
                    fichas.remove(atual);
                    pivo++;
                    if (pivo >= ordem.size()) {
                        pivo = 0;
                    }
                    return atual;
                }
            }
        }
        return null;
    }
}