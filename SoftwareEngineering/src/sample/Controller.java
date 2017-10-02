package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    int count_nre = 0, count_pfe = 0;
    ArrayList<Ficha> fichas = new ArrayList<>();
    Criterio_interface criterio;

    public void setCriterio(int tipo) {
        if(tipo == 0){

        }else if(tipo == 1){
            this.criterio = new Criterio1(fichas);
        }
    }

    public void  newTurno(){
        fichas.clear();
        count_nre = count_pfe = 0;
    }


    public void addFicha(String tipo){
        Ficha ficha_temp = null;
        if(tipo.equals("NRE")){
            ficha_temp = new Ficha("NRE", count_nre++);
        }else if (tipo.equals("PFE")){
            ficha_temp = new Ficha("PFE", count_pfe++);
        }
        fichas.add(ficha_temp);
    }
}