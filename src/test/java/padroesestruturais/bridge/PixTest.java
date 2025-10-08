package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixTest {

    @Test
    void deveRetornarValorPixComMercadoPago() {
        GatewayPagamento gatewayPagamento = new MercadoPago();
        Pix pix = new Pix(100.0f);
        pix.setGatewayPagamento(gatewayPagamento);
        assertEquals(104.99f, pix.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorPixComPagSeguro() {
        GatewayPagamento gatewayPagamento = new PagSeguro();
        Pix pix = new Pix(100.0f);
        pix.setGatewayPagamento(gatewayPagamento);
        assertEquals(104.40f, pix.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorPixComStripe() {
        GatewayPagamento gatewayPagamento = new Stripe();
        Pix pix = new Pix(100.0f);
        pix.setGatewayPagamento(gatewayPagamento);
        assertEquals(102.99f, pix.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorPixComCielo() {
        GatewayPagamento gatewayPagamento = new Cielo();
        Pix pix = new Pix(100.0f);
        pix.setGatewayPagamento(gatewayPagamento);
        assertEquals(103.50f, pix.calcularValorFinal(), 0.01f);
    }
}
