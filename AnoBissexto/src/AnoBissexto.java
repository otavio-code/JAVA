public class AnoBissexto {

    private int ano;
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verfificaAno() {
        if (getAno() % 4 == 0) {
            System.out.println("O ano de " + getAno() + " é bissexto");}
        else {
            System.out.println("O ano de " + getAno() + " não é bissexto");}
    }
}