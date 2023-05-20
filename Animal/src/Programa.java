public class Programa {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.nome = "Bidu";
        animal.especie = "Cachorro";
        animal.habitat = "Do lar";
        animal.idade = 4;

        System.out.println("Nome: " + animal.nome);
        System.out.println("Espécie: " + animal.especie);
        System.out.println("Habitat: " + animal.habitat);
        System.out.println("Idade: " + animal.idade);
        System.out.println(animal.Som(animal.especie));

    }
}