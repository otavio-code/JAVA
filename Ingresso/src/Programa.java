import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int opcaoIngresso;
        int opcaoVip;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a opção do ingresso.");
        System.out.println("Digite 1 para normal e 2 para VIP:");
        opcaoIngresso = leia.nextInt();
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        normal.setValor(20);


        if(opcaoIngresso == 1){
            normal.imprimeIngressoNormal();
            normal.imprimevalor(normal.getValor());
        }else if(opcaoIngresso == 2){
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            opcaoVip = leia.nextInt();
            if(opcaoVip == 1){
                System.out.println("O seu camarote é o superior");
                camaroteSuperior.retorneAdicionalSuperior(normal.getValor());
            }else if(opcaoVip == 2){
                System.out.println("O seu camarote é o inferior");
                camaroteInferior.retorneAdicional(normal.getValor());
            }else{
                System.out.println("Valores inválidos");
            }

        }else{
            System.out.println("Valores inválidos");
        }

    }
}