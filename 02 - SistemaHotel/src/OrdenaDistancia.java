import java.util.Comparator;

public class OrdenaDistancia implements Comparator<Hotel>{
    public int compare(Hotel h1,Hotel h2){
        if (h1.getDistancia() < h2.getDistancia()) {
            return -1;
        } else if (h1.getDistancia() > h2.getDistancia()) {
            return 1;
        } else {
            return 0;
        }
    }
}
