public class Carro {
    String marca;
    String modelo;
    String cor;
    int quilometragem;
    String tipo_combustivel;
    double aceleracao;
    String frenagem;

    public String aceleracao(double aceleracao){
        this.aceleracao = aceleracao;
        return ("Este carro tem uma aceleração de " + aceleracao + "s");
    }
    public String frenagem(String frenagem){
        this.frenagem = frenagem;
        return ("Este carro tem uma frenagem do tipo " + frenagem);
    }
}
