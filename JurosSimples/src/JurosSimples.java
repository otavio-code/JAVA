public class JurosSimples {
    private double capital;
    private double taxa;
    private int tempo;

    public JurosSimples(double capital, double taxa, int tempo) {
            setCapital(capital);
            setTaxa(taxa);
            setTempo(tempo);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if(taxa > 0) {
            this.taxa = taxa;
        }else {
            System.out.println("ERRO: Valor da taxa invalido");
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if(tempo > 0 && tempo <= 12) {
            this.tempo = tempo;
        }else {
            System.out.println("ERRO: Valor do tempo invalido");
        }
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        if(capital > 0) {
            this.capital = capital;
        }else{
            System.out.println("Erro: capital invalido");
        }
    }

    public String getValorDosJuros() {
        double valorJuros = (getCapital() * getTaxa() * getTempo()) / 100;
        if(valorJuros > 0){
            String str = Double.toString(valorJuros);
            return str;
        }else{
            return "";
        }

    }
}
