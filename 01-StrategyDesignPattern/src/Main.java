import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        Controller control = new Controller();
        System.out.println("Reservando fichas ... ");
        control.setCriterio(1);
        control.addFicha("NRE");
        control.addFicha("NRE");
        control.addFicha("NRE");
        control.addFicha("NRE");
        control.addFicha("NRE");
        control.addFicha("PFE");

        control.addFicha("NFE");
        control.addFicha("NFE");
        control.addFicha("PRE");
        control.addFicha("PFE");
        control.addFicha("NRE");
        control.addFicha("PFE");
        System.out.println("Definindo critério de chamada ... ");
        System.out.println("Chamando as fichas ... ");

        int total = control.getTotalFila();

        for (int i = 0; i < total; i++){
            System.out.println("Ficha puxada: " + i +" == "+  control.proximaFicha());
        }

    }
}