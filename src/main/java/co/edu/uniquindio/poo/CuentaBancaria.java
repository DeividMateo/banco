package co.edu.uniquindio.poo;



public abstract class CuentaBancaria {
    private final String numeroCuenta;
    private double saldo;
    private final Titular titular;
    private EstadoCuenta estadoCuenta;
   

    public CuentaBancaria(String numeroCuenta, double saldo, Titular titular) {
        assert saldo >= 0 : "El saldo no puede ser negativo";   
        
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;


        actualizarEstadoCuenta();

    }
    private void actualizarEstadoCuenta() {
        if (saldo == 0) {
            estadoCuenta = EstadoCuenta.INACTIVA;
        } else {
            estadoCuenta = EstadoCuenta.ACTIVA;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public EstadoCuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public void depositar(double valorDeposito) {
          saldo += valorDeposito;
    
    }

   

    public abstract void retirar(double valorRetirar);
}


