import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrestadorServico colaraborador = new PrestadorServico();
        System.out.println("Digite seu nome: ");
        colaraborador.setNome(sc.nextLine());
        System.out.println("Digite o valor por hora: ");
        colaraborador.setValorHora(sc.nextDouble());
        System.out.println("Digite o total de horas trabalhadas: ");
        colaraborador.setTotalHorasTrabalhadas(sc.nextInt());
        System.out.println("Digite o valor a descontar: ");
        colaraborador.setValorDesconto(sc.nextDouble());

        colaraborador.calcularFolhaPagamento();


    }
}