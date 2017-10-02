package sample;

class Main {

    public static void main(String[] args) {
        Controller control = new Controller();
        System.out.println("Reservando fichas ... ");
        control.addFicha("NRE");
        control.addFicha("NRE");
        control.addFicha("PFE");
        control.addFicha("NRE");
        control.addFicha("PFE");
        System.out.println("Definindo critério de chamada ... ");
        control.setCriterio(0);
        System.out.println("Chamando as fichas ... ");
        control.criterio.puxarProximo();
    }
}