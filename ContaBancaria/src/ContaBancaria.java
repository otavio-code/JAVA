public class ContaBancaria {

    int agencia;
    int conta;
    String tipo_conta;
    String nome_titular;
    double saldo;
    double valor_saque;
    double valor_deposito;

    public String saque(double valor_saque) {
        if (saldo >= valor_saque) {
            this.saldo = this.saldo - valor_saque;
            return "Saque de " + valor_saque + " realizado com sucesso, o valor do saldo é: " + saldo;
        } else {
            return ("Saldo insuficiente: " + saldo);
        }
    }

    public String deposito(double valor_deposito) {
        if (valor_deposito > 0) {
            this.saldo = this.saldo + valor_deposito;
            return ("O Valor de " + valor_deposito + " foi realizado, " + "o seu saldo é: " + saldo);
        }else{
            return ("Valor de depósito inválido: " + valor_deposito);
        }
    }

}
