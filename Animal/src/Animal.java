public class Animal {
    String nome;
    int idade;
    String especie;
    String habitat;

    String som;

    public String Som(String som){
        this.som = som;
        return ("Este animal faz: " + som);
    }
}
