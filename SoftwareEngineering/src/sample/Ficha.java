package sample;

class Ficha {
    private int numero;
    private String tipo;

    public Ficha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Ficha(String tipo) {
        this.tipo = tipo;
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}