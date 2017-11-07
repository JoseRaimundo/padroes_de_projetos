public class PagamentoEspecie implements PagamentoI{

    @Override
    public String tipoPagemento(Double valor) {
        return "R$ "+ valor + " - Pago com dinheiro em especie";
    }
}
