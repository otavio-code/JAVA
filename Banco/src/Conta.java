public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double sacar();
    public abstract double depositar();
    public abstract double obterSaldo();

}
