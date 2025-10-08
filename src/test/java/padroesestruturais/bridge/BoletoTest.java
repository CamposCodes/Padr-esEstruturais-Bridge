package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    @Test
    void deveRetornarValorBoletoSemTaxa() {
        GatewayPagamento gatewayPagamento = new MercadoPago();
        Boleto boleto = new Boleto(150.0f);
        boleto.setGatewayPagamento(gatewayPagamento);
        assertEquals(150.0f, boleto.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorBoletoComPagSeguro() {
        GatewayPagamento gatewayPagamento = new PagSeguro();
        Boleto boleto = new Boleto(150.0f);
        boleto.setGatewayPagamento(gatewayPagamento);
        assertEquals(150.0f, boleto.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorBoletoComStripe() {
        GatewayPagamento gatewayPagamento = new Stripe();
        Boleto boleto = new Boleto(150.0f);
        boleto.setGatewayPagamento(gatewayPagamento);
        assertEquals(150.0f, boleto.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorBoletoComCielo() {
        GatewayPagamento gatewayPagamento = new Cielo();
        Boleto boleto = new Boleto(150.0f);
        boleto.setGatewayPagamento(gatewayPagamento);
        assertEquals(150.0f, boleto.calcularValorFinal(), 0.01f);
    }
}
