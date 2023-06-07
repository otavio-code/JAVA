public class Retangulo{
    private double base;
    private double altura;
    private double comprimento;
    private String material;
    private double PesoEspecifico;
    private double valorKilo;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPesoEspecifico() {
        return PesoEspecifico;
    }

    public void setPesoEspecifico(double pesoEspecifico) {
        PesoEspecifico = pesoEspecifico;
    }

    public double getValorKilo() {
        return valorKilo;
    }

    public void setValorKilo(double valorKilo) {
        this.valorKilo = valorKilo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double getVolume() {
        return area() * getComprimento();
    }

    public double getPeso(){
        return getVolume() * getPesoEspecifico();
    }

    public double getCusto(){
        return getPeso() * getValorKilo();
    }
}