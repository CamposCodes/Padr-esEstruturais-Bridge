package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoCreditoTest {

    @Test
    void deveRetornarValorCartaoCreditoComMercadoPago() {
        GatewayPagamento gatewayPagamento = new MercadoPago();
        CartaoCredito cartaoCredito = new CartaoCredito(100.0f);
        cartaoCredito.setGatewayPagamento(gatewayPagamento);
        cartaoCredito.setNumParcelas(3);
        assertEquals(314.97f, cartaoCredito.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorCartaoCreditoComPagSeguro() {
        GatewayPagamento gatewayPagamento = new PagSeguro();
        CartaoCredito cartaoCredito = new CartaoCredito(100.0f);
        cartaoCredito.setGatewayPagamento(gatewayPagamento);
        cartaoCredito.setNumParcelas(3);
        assertEquals(313.20f, cartaoCredito.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorCartaoCreditoComStripe() {
        GatewayPagamento gatewayPagamento = new Stripe();
        CartaoCredito cartaoCredito = new CartaoCredito(100.0f);
        cartaoCredito.setGatewayPagamento(gatewayPagamento);
        cartaoCredito.setNumParcelas(3);
        assertEquals(308.97f, cartaoCredito.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorCartaoCreditoComCielo() {
        GatewayPagamento gatewayPagamento = new Cielo();
        CartaoCredito cartaoCredito = new CartaoCredito(100.0f);
        cartaoCredito.setGatewayPagamento(gatewayPagamento);
        cartaoCredito.setNumParcelas(3);
        assertEquals(310.50f, cartaoCredito.calcularValorFinal(), 0.01f);
    }
}
