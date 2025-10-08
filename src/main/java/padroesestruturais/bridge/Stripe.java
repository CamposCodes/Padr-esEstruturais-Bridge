package padroesestruturais.bridge;

public class Stripe implements GatewayPagamento {

    public float percentualTaxa() {
        return 0.0299f;
    }
}
