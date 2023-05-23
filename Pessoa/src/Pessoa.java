public class Pessoa {
    String nome;
    int idade;
    String endereco;
    String telefone;
    String email;

    public String imprimir(String nome, int idade, String endereco, String telefone, String email){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        if(nome =! ""){
            return ("Dados da pessoa:" +
                    "Nome: " + nome + "\n" +
                    "Nome: " + idade + "\n" +
                    "Nome: " + endereco + "\n" +
                    "Nome: " + telefone + "\n" +
                    "Nome: " + email);
        }
    }

}
