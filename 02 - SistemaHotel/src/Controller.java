import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class Controller {

    private static ArrayList<Hotel> hoteis = new ArrayList<>();
    private static ArrayList<Cidade> cidades = new ArrayList<>();
    private static ArrayList<Contrato> contratos = new ArrayList<>(); //só registra as strings

    public static void cadastraCidade(String nome){
        Cidade c = new Cidade(nome);
        cidades.add(c);
    }



    public static Cidade localizaCidade (String nome){
        for(Cidade c: cidades){
            if (c.equals(nome)) return c;
        }
        return null;
    }

    public static  Hotel localizaHotel(String nome){
        for(Hotel h: hoteis){
            if (h.equals(nome)) return h;
        }
        return null;
    }

    public static boolean cadastraHotel(String nome, String cidade, double distancia, double avaliacao){
        Cidade c = localizaCidade(cidade);
        if (c != null) {
            //verifica se o hotel já existe
            Hotel hotel = new Hotel(nome, c, distancia, avaliacao);
            hoteis.add(hotel);
            return true;
        }
        return false;
    }

    public static  boolean cadastraQuarto(String hotel,  TipoQuarto tipo){
        Hotel h = localizaHotel(hotel);
        if (h != null){
            h.addQuarto(tipo);
        }
        return false;
    }

    public static void cadastraPreco(String hotel, TipoQuarto tipo, double valor){
        Hotel h = localizaHotel(hotel);
        h.addPreco(tipo, valor);
    }

    public static String retonaOrdenaAvaliacao(){
        ArrayList<Hotel> hoteis_temp = new ArrayList<>();
        String hoteis_result = "";
        Collections.sort (hoteis_temp, (Comparator) (o1, o2) -> {
            Hotel h1 = (Hotel) o1;
            Hotel h2 = (Hotel) o2;
            return h1.getAvaliacao() > h2.getAvaliacao() ? -1 : (h1.getAvaliacao() < h2.getAvaliacao() ? +1 : 0);
        });
        for(Hotel h: hoteis_temp){
            hoteis_result += h + "\n";
        }
        return hoteis_result;
    }

    public static double calculaPreco(String hotel, TipoQuarto tipo, String entrada, String saida){
        Hotel h = localizaHotel(hotel);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate in = LocalDate.parse(entrada, formato);
        LocalDate out = LocalDate.parse(saida, formato);

        int total = saida.compareTo(entrada);

        double preco = h.getPreco(tipo);
        return Math.floor(total*preco);
    }

    public static boolean contrataQuarto(String hotel, String quarto, TipoQuarto tipo, String entrada, String saida){
        Hotel h = localizaHotel(hotel);
        System.out.println("entrou " + h);
        if (h != null ){
            Quarto q = h.getQuarto(quarto, tipo);
            if (q != null){
                double valor_total = calculaPreco(hotel, tipo, entrada, saida);
                contratos.add(new Contrato(h.toString(), q.toString(), new PagamentoEspecie().tipoPagemento(valor_total), entrada, saida , valor_total ));
            }

        }
        return false;
    }


    public static ArrayList<Hotel> ordenadoDistancia(){
        ArrayList<Hotel> hoteis_temp = hoteis;
        Collections.sort(hoteis_temp, new OrdenaDistancia());
        return hoteis_temp;
    }

    public static ArrayList<Hotel> ordenadoPreco(TipoQuarto tipo){
        ArrayList<Hotel> hoteis_temp = hoteis;
        Collections.sort(hoteis_temp, new OrdenaPreco(tipo));
        return hoteis_temp;
    }


    public static  String listaContratos(){
        String result = "";
        for(Contrato c: contratos){
            result += c;
        }
        return result;
    }











}
