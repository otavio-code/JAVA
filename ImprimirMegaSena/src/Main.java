import java.util.Random ;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 60; i++) {
            if (i % 10 == 0) {
                System.out.println("[" + i + "]");
            } else if (i <= 9) {
                System.out.print("[0" + i + "]");
            } else {
                System.out.print("[" + i + "]");
            }

        }

        System.out.println("Números sorteados: ");
        Random gerador = new Random();

        for(int i = 0 ; i < 7 ; i++){
            int numeroAleatorio = gerador.nextInt(60);
            System.out.print(numeroAleatorio + " ");
        }
    }
}
