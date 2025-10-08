package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferenciaBancariaTest {

    @Test
    void deveRetornarValorTransferenciaComMercadoPago() {
        GatewayPagamento gatewayPagamento = new MercadoPago();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(200.0f);
        transferenciaBancaria.setGatewayPagamento(gatewayPagamento);
        assertEquals(209.98f, transferenciaBancaria.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorTransferenciaComPagSeguro() {
        GatewayPagamento gatewayPagamento = new PagSeguro();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(200.0f);
        transferenciaBancaria.setGatewayPagamento(gatewayPagamento);
        assertEquals(208.80f, transferenciaBancaria.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorTransferenciaComStripe() {
        GatewayPagamento gatewayPagamento = new Stripe();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(200.0f);
        transferenciaBancaria.setGatewayPagamento(gatewayPagamento);
        assertEquals(205.98f, transferenciaBancaria.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorTransferenciaComCielo() {
        GatewayPagamento gatewayPagamento = new Cielo();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(200.0f);
        transferenciaBancaria.setGatewayPagamento(gatewayPagamento);
        assertEquals(207.00f, transferenciaBancaria.calcularValorFinal(), 0.01f);
    }
}
