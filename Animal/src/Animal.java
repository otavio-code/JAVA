public class Animal {
    String nome;
    int idade;
    String especie;
    String habitat;

    public String Som(String especie){
        this.especie = especie;
        if(especie == "Cachorro"){
            return ("Este animal faz este som: AuAuAuAuAu");
        }else if(especie == "Gato"){
            return ("Este animal faz este som: MiauMiauMiau");
        }else{
            return ("Espécie informada inválida");
        }
    }
}
