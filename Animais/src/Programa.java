public class Programa {
    public static void main(String[] args) {

        Animal animais[] = new Animal[6];
        Animal animal = new Animal();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setRaca("Capa Preta");
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Neguinho");
        cachorro2.setRaca("Fila Argentino");

        Gato gato1 = new Gato();
        gato1.setNome("Fubá");
        gato1.setRaca("Branco");
        Gato gato2 = new Gato();
        gato2.setNome("Mingau");
        gato2.setRaca("Blue");

        animais[0] = cachorro1;
        animais[1] = cachorro2;
        animais[2] = gato1;
        animais[3] = gato2;
        animais[4] = animal;

        for (int i = 0; i < animais.length; i++) {
            if(animais[i] != null){
                System.out.println(animais[i].getNome());
                System.out.println(animais[i].getRaca());
                System.out.println(animais[i].caminha());
                System.out.println();

            }
        }
    }
}