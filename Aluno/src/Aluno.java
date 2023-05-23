import java.util.Scanner;
public class Aluno {
    String nome;
    String disciplina;
    double media;
    Scanner leia = new Scanner(System.in);
    double notas[] = new double[3];

    public double calculaMedia(){
        for (int i = 0; i < notas.length; i++){
            media += notas[i];

        }
        return media / notas.length;
    }
    public void atribuirNotas(){
        for (int i = 0; i< notas.length; i++){
            System.out.println("Entre com a " + (i+1) + "ª nota: ");
            notas[i] = leia.nextDouble();
        }
    }

}
