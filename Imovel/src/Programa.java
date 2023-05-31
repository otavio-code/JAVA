import java.util.Scanner;

/*1.
        Crie a classe Imovel, que possui um endereço e um preço.
        a.
        crie uma classe Novo, que herda Imovel e possui um adicional no
        preço. Crie métodos de acesso e impressão deste valor adicional.
        b.
        crie uma classe Velho, que herda Imovel e possui um desconto no
        preço. Crie métodos de acesso e impressão para este desconto.
        C
        rie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho.
        Conforme a definição do usuário, imprima o valor final d o imóvel.*/
public class Programa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o tipo de imóvel.");
        System.out.println("Ex: 1 para novo e 2 para velho: ");
        int opcao;
        opcao = leia.nextInt();

        if (opcao == 1) {
            Novo novo = new Novo();
            System.out.println("Digite o preço do imóvel novo: ");
            novo.setPreco(leia.nextDouble());
            novo.adicional(novo.getPreco());
        } else if(opcao == 2) {
            Velho velho = new Velho();
            System.out.println("Digite o preço do imóvel velho: ");
            velho.setPreco(leia.nextDouble());
            velho.desconto(velho.getPreco());
        } else{
            System.out.println("Parametros inválidos");
        }
    }
}