package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaCorrienteTest.class.getName());

    @Test

    public void testSaldoNegtivo() {
        LOG.info("Iniciando pruebas de SaldoNegativo");
        assertThrows(Throwable.class, () -> new CuentaCorriente("123", -10000, new Titular("123", "Juan"), 1));
        LOG.info("Finalizando prueba de SaldoNegativo");

    }
}
