package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    int count_nre = 0, count_pfe = 0, count_pre = 0, count_nfe = 0;
    ArrayList<Ficha> fichas = new ArrayList<>();
    Criterio_interface criterio;

    public void setCriterio(int tipo) {
        if(tipo == 0){
            this.criterio = new Criterio_default(fichas);
        }else if(tipo == 1){
            this.criterio = new Criterio1(fichas);
        }else if(tipo == 2){
            this.criterio = new Criterio2(fichas);
        }else if(tipo == 3){
            this.criterio = new Criterio3(fichas);
        }else if(tipo == 4){
            this.criterio = new Criterio4(fichas);
        }
    }

    public void  novoTurno(){
        fichas.clear();
        count_nre = count_pfe = count_pre = count_nfe = 0;
    }


    public void addFicha(String tipo){
        Ficha ficha_temp = null;
        if(tipo.equals("NRE")){
            ficha_temp = new Ficha("NRE", count_nre++);
        }else if (tipo.equals("PFE")){
            ficha_temp = new Ficha("PFE", count_pfe++);
        }else if (tipo.equals("PRE")){
            ficha_temp = new Ficha("PRE", count_pre++);
        }else if (tipo.equals("NFE")){
            ficha_temp = new Ficha("NFE", count_nfe++);
        }
        fichas.add(ficha_temp);
    }

    public Ficha proximaFicha(){
        Ficha atual = criterio.Puxar();
        if(atual == null){
            System.out.println("Mundança automática de crítério: Defalt");
           setCriterio(0);
           atual = criterio.Puxar();
        }
        return atual;
    }

    public int getTotalFila(){
        return fichas.size();
    }
}