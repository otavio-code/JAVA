import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        AnoBissexto anoB = new AnoBissexto();
        System.out.println("Digite o ano:");
        anoB.setAno(leia.nextInt());
        anoB.verfificaAno();

    }
}