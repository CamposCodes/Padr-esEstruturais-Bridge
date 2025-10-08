package padroesestruturais.bridge;

public class Boleto extends TipoPagamento {

    public Boleto(float valorBase) {
        super(valorBase);
    }

    public float calcularValorFinal() {
        return this.valorBase;
    }
}
