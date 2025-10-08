package padroesestruturais.bridge;

public class CartaoCredito extends TipoPagamento {

    private int numParcelas;

    public CartaoCredito(float valorBase) {
        super(valorBase);
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public float calcularValorFinal() {
        return this.valorBase * this.numParcelas * (1 + this.gatewayPagamento.percentualTaxa());
    }
}
