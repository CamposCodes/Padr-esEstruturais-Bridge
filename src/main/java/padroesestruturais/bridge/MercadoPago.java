package padroesestruturais.bridge;

public class MercadoPago implements GatewayPagamento {

    public float percentualTaxa() {
        return 0.0499f;
    }
}
