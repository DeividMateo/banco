package co.edu.uniquindio.poo;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldo, Titular titular, double tasaInteres) {
        super(numeroCuenta, saldo, titular);
        this.tasaInteres = tasaInteres;
        assert tasaInteres > 0 : "La tasa de interes no puede ser negativa";
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void retirar(double valorRetirar) {
        var saldo = getSaldo();
        if (getSaldo() >= valorRetirar) {
            setSaldo(saldo - valorRetirar);
        }

    }



}
