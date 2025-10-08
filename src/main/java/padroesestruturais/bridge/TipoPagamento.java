package padroesestruturais.bridge;

public abstract class TipoPagamento {

    protected float valorBase;
    protected GatewayPagamento gatewayPagamento;

    public TipoPagamento(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setGatewayPagamento(GatewayPagamento gatewayPagamento) {
        this.gatewayPagamento = gatewayPagamento;
    }

    public abstract float calcularValorFinal();
}
