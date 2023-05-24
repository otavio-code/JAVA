import java.util.Scanner;

public class Aluno {
    String nome;
    String disciplina;
    double[] nota = new double[3];
    double notaFinal;

    public void entraNotas(){
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.print("\nEntre com o nome do aluno: ");
        nome = leia.next();
        System.out.print("Entre com o nome da disciplina: ");
        disciplina=leia.next();
        for (i=0;i<nota.length;i++){
            System.out.printf("Entre com a nota %d do aluno: ",i+1);
            nota[i]=leia.nextDouble();
        }
    }

    public double mediaAluno(){
        int i;
        notaFinal=0;

        for (i=0;i<nota.length;i++){
            notaFinal=notaFinal+nota[i];
        }

        notaFinal=notaFinal/nota.length;
        return notaFinal;
    }

}
