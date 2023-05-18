/*Crie uma classe "Conta Bancária" que tenha
 como atributos o número da conta,
  o nome do titular, o saldo, a agência e o tipo de conta,
   e como métodos saque e depósito.*/
public class Main {
    public static void main(String[] args) {

        ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.nome_titular = "Otávio Andrade";
        contabancaria.agencia = 3466;
        contabancaria.conta = 34566093;
        contabancaria.tipo_conta = "Conta-Corrente";
        contabancaria.saldo = 1000;

        System.out.println("Nome Titular: " + contabancaria.nome_titular);
        System.out.println("Agencia: " + contabancaria.agencia);
        System.out.println("Conta: " + contabancaria.conta);
        System.out.println("Tipo de Conta: " + contabancaria.tipo_conta);
        System.out.println("Saque: " + contabancaria.saque(399));
        System.out.println("Deposito: " + contabancaria.deposito(400));
    }
}