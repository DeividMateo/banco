package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, Titular titular, double limiteSobregiro) {
        super(numeroCuenta, saldo, titular);
        this.limiteSobregiro = limiteSobregiro;

    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public void retirar(double valorRetirar) {
        var saldo = getSaldo();
        if (getSaldo() + limiteSobregiro >= valorRetirar) {
            setSaldo(saldo - valorRetirar);
        }

    }
}