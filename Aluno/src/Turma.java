public class Turma {
    Aluno turmas[] = new Aluno[3];
    double mediaDaTurma;

    public double calcularMediaDaTurma(){
        for(int i = 0; i < turmas.length; i++){
            this.mediaDaTurma += this.turmas[i].calculaMedia();
        }
        return this.mediaDaTurma / this.turmas.length;
    }
}
