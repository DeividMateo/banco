package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;

import java.util.LinkedList;

public class Banco {
    private Collection<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new LinkedList<>();
    }

    public void addCuenta(CuentaBancaria cuentaBancaria) {
        cuentas.add(cuentaBancaria);
    }

    public Collection<CuentaBancaria> getCuentas() {
        return Collections.unmodifiableCollection(cuentas);

    }

    public Collection<CuentaAhorros> getCuentaAhorros() {
        Collection<CuentaAhorros> cuentasAhorros;

        cuentasAhorros = new LinkedList<>();

        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria instanceof CuentaAhorros) {
                cuentasAhorros.add((CuentaAhorros) cuentaBancaria);
            }

        }
        return Collections.unmodifiableCollection(cuentasAhorros);

    }

    public boolean verificarSaldo(CuentaBancaria cuentaBancaria) {
        return cuentaBancaria.getSaldo() > 0;
    }

    public boolean transferirSaldoEntreCuentas(String numeroCuentaOrigen, String numeroCuentaDestino, int saldo) {
        CuentaBancaria CuentaBancariaOrigen = null;
        CuentaBancaria CuentaBancariaDestino = null;

        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria.getNumeroCuenta() == numeroCuentaOrigen) {
                CuentaBancariaOrigen = cuentaBancaria;
            }
            if (cuentaBancaria.getNumeroCuenta() == numeroCuentaDestino) {
                CuentaBancariaDestino = cuentaBancaria;

            }
        }

        CuentaBancariaOrigen.retirar(saldo);
        CuentaBancariaDestino.depositar(saldo);
        return true;

    }

}
