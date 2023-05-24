public class Programa {
    public static void main(String[] arg){
        int i;
        Aluno aluno = new Aluno();
        MediaTurma mediaTurma = new MediaTurma();

        for (i=0;i<mediaTurma.nota.length;i++){
            aluno.entraNotas();
            mediaTurma.nota[i] = aluno.mediaAluno();
            System.out.printf("NOME DO ALUNO: %s\nNOME DA DISCIPLINA: %s\nNOTA FINAL: %.2f",aluno.nome,aluno.disciplina,aluno.notaFinal);
        }

        mediaTurma.notaFinal();
        System.out.printf("\nNOTA DA TURMA: %.2f",mediaTurma.media);
    }
}