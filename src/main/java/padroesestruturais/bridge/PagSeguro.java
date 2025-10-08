package padroesestruturais.bridge;

public class PagSeguro implements GatewayPagamento {

    public float percentualTaxa() {
        return 0.0440f;
    }
}
