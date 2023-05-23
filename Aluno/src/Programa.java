public class Programa {
    public static void main(String[] args) {

        Turma java = new Turma();


        Aluno alunoUm = new Aluno();
        alunoUm.nome = "Leandro";
        alunoUm.disciplina = "Java";
        alunoUm.atribuirNotas();

        Aluno alunoDois = new Aluno();
        alunoDois.nome = "Otávio";
        alunoDois.disciplina = "Java";
        alunoDois.atribuirNotas();

        Aluno alunoTres = new Aluno();
        alunoTres.nome = "Neide";
        alunoTres.disciplina = "Java";
        alunoTres.atribuirNotas();

        System.out.printf("MEDIA do aluno 1: %.2f \n", alunoUm.calculaMedia());
        System.out.printf("MEDIA do aluno 2: %.2f \n", alunoDois.calculaMedia());
        System.out.printf("MEDIA do aluno 3: %.2f \n", alunoTres.calculaMedia());

        java.turmas[0] = alunoUm;
        java.turmas[1] = alunoDois;
        java.turmas[2] = alunoTres;

        System.out.printf("A MEDIA DA TURMA FOI: %.2f \n", java.calcularMediaDaTurma());


    }
}