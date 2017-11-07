public class Quarto {
    private String numero;

    public Quarto(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object quarto) {
        return numero != null ? numero.equals(quarto.toString()) : quarto == null;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
