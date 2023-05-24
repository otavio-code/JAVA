public class Main {
    public static void main(String[] args) {

        Pessoas pessoas = new Pessoas();
        pessoas.setNome("Otávio Andrade");
        pessoas.setCpf("999.999.999-99");
        pessoas.setIdade(32);

        System.out.println("NOME: " + pessoas.getNome());
        System.out.println("CPF: " + pessoas.getCpf());
        System.out.println("IDADE: " + pessoas.getIdade());


    }
}