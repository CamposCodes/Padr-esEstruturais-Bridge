package padroesestruturais.bridge;

public class TransferenciaBancaria extends TipoPagamento {

    public TransferenciaBancaria(float valorBase) {
        super(valorBase);
    }

    public float calcularValorFinal() {
        return this.valorBase * (1 + this.gatewayPagamento.percentualTaxa());
    }
}
