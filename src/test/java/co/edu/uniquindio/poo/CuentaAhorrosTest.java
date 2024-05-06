 package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaAhorrosTest {
private static final  Logger LOG = Logger.getLogger(CuentaAhorrosTest.class.getName());

    @Test

    public void testSaldoNegtivo() {
        LOG.info("Iniciando pruebas de SaldoNegativo");
        assertThrows(Throwable.class,()-> new CuentaAhorros("123", -10000, new Titular("123", "Juan"), 1));
        LOG.info("Finalizando prueba de SaldoNegativo");



    } 
    
}