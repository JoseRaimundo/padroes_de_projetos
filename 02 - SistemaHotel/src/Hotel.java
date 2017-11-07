import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String nome;
    private Cidade cidade;
    private double distancia;
    private double avaliacao;

    private HashMap<TipoQuarto, Double> valorTipo = new HashMap<>();
    private ArrayList<Quarto> qSing = new ArrayList<>();
    private ArrayList<Quarto> qDupl = new ArrayList<>();
    private ArrayList<Quarto> qTrip = new ArrayList<>();
    private ArrayList<Quarto> qPres = new ArrayList<>();

    public Hotel(String nome, Cidade cidade, double distancia,  double avaliacao) {
        this.nome = nome;
        this.distancia = distancia;
        this.cidade = cidade;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }


    public void addQuarto(TipoQuarto tipo){
        if (tipo == TipoQuarto.SINGLE){
            qSing.add(new Quarto(qSing.size()+""));
        }else if(tipo == TipoQuarto.DUPLO){
            qDupl.add(new Quarto(qTrip.size()+""));
        }else if(tipo == TipoQuarto.TRIPLO){
            qTrip.add(new Quarto(qTrip.size()+""));
        }else if(tipo == TipoQuarto.PRESIDENCIAL){
            qPres.add(new Quarto(qPres.size()+""));
        }
    }

    public double getPreco(TipoQuarto tipo){
        return valorTipo.get(tipo);
    }

    public void addPreco(TipoQuarto tipo, Double valor){
        valorTipo.put(tipo, valor);
    }

    public Quarto getQuarto(String nome, TipoQuarto tipo){
        if (tipo == TipoQuarto.SINGLE){
            if (qSing.size() == 0)return null;
            for(Quarto q: qSing) {
                if (q.equals(nome)){
                    return q;
                }
            }
        }else if (tipo == TipoQuarto.DUPLO){
            if (qDupl.size() == 0)return null;
            for(Quarto q: qDupl) {
                if (q.equals(nome)) return q;
            }
        }else if (tipo == TipoQuarto.TRIPLO){
            if (qTrip.size() == 0)return null;
            for(Quarto q: qTrip) {
                if (q.equals(nome)) return q;
            }
        }else if (tipo == TipoQuarto.PRESIDENCIAL){
            if (qPres.size() == 0)return null;
            for(Quarto q: qPres) {
                if (q.equals(nome)) return q;
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object hotel) {
        return nome != null ? nome.equals(hotel) : hotel == null;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", distancia=" + distancia +
                ", cidade=" + cidade +
                ", classificacao=" + avaliacao +
                '}' + "\n";
    }
}
