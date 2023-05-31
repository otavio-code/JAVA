public class CamaroteInferior extends Vip{
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao(){
        System.out.println("Localização do ingresso é no: " + localizacao);
    }
}
