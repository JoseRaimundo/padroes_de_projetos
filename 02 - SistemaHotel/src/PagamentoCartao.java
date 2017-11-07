public class PagamentoCartao implements PagamentoI {

    @Override
    public String tipoPagemento(Double valor) {
        return "R$ "+ valor + " - Pago com Cartão";
    }
}
