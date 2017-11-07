public class Contrato {
    private String hotel;
    private String quarto;
    private String pagamento;
    private String entrada;
    private String saida;
    private double valor;

    public Contrato(String hotel, String quarto, String pagamento, String entrada, String saida, double valor) {
        this.hotel = hotel;
        this.quarto = quarto;
        this.pagamento = pagamento;
        this.entrada = entrada;
        this.saida = saida;
        this.valor = valor;
    }

    //get e sets

    @Override
    public String toString() {
        return "Contrato{" + "\n" +
                " hotel='" + hotel + '\'' +
                " quarto='" + quarto + '\'' + "\n" +
                " pagamento='" + pagamento + '\'' + "\n" +
                " entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' + "\n" +
                " valor=" + valor + "\n" +
                '}';
    }
}
