import java.util.Comparator;

public class OrdenaPreco implements Comparator<Hotel> {
    private TipoQuarto tipo;
    public  OrdenaPreco(TipoQuarto tipo){
        this.tipo = tipo;
    }
    public int compare(Hotel h1,Hotel h2){
        if (h1.getPreco(tipo) < h2.getPreco(tipo))
            return -1;
        else if (h1.getPreco(tipo) < h2.getPreco(tipo))
            return 1;
        else
            return 0;
    }
}
