package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;


import org.junit.jupiter.api.Test;

public class BancoTest {
  

    @Test
    public void CuentasAhorroNoModificables() {
        Banco banco = new Banco();
        CuentaAhorros cuentaAhorros = new CuentaAhorros("123", 1000.0, new Titular("123", "Juan"), 0.1);
        CuentaAhorros cuentaAhorros2 = new CuentaAhorros("124", 2000.0, new Titular("124", "Pedro"), 0.2);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("125", 3000.0, new Titular("125", "Maria"), 1000.0);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("126", 4000.0, new Titular("126", "Ana"), 2000.0);
        banco.addCuenta(cuentaAhorros);
        banco.addCuenta(cuentaAhorros2);
        banco.addCuenta(cuentaCorriente); 
        banco.addCuenta(cuentaCorriente2);  

        Collection<CuentaAhorros> listaEsperada = List.of(cuentaAhorros, cuentaAhorros2);

        assertIterableEquals(listaEsperada, banco.getCuentaAhorros());

    }

    @Test

    public void TestdepositarTrasladarsaldoCuentaExistente(){
        Banco banco = new Banco();
        CuentaAhorros cuentaAhorros = new CuentaAhorros("123", 1000.0, new Titular("123", "Juan"), 0.1);
        CuentaAhorros cuentaAhorros2 = new CuentaAhorros("124", 2000.0, new Titular("124", "Pedro"), 0.2);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("125", 3000.0, new Titular("125", "Maria"), 1000.0);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("126", 4000.0, new Titular("126", "Ana"), 2000.0);
        banco.addCuenta(cuentaAhorros);
        banco.addCuenta(cuentaAhorros2);
        banco.addCuenta(cuentaCorriente); 
        banco.addCuenta(cuentaCorriente2);  

        banco.transferirSaldoEntreCuentas("123","124", 1000);


        assertTrue(cuentaAhorros.getSaldo() == 0);
        assertTrue(cuentaAhorros2.getSaldo() == 3000);
    }



}
