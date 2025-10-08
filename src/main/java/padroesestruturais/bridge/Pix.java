package padroesestruturais.bridge;

public class Pix extends TipoPagamento {

    public Pix(float valorBase) {
        super(valorBase);
    }

    public float calcularValorFinal() {
        return this.valorBase * (1 + this.gatewayPagamento.percentualTaxa());
    }
}
