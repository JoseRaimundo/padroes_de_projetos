package sample;

class Ficha {
    int numero;
    String tipo;

    public Ficha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
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
}