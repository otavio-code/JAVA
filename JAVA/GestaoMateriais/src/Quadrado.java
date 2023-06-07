public class Quadrado{
    private double lado;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(getLado(), 2);
    }

    public double getVolume() {
        return Math.pow(getLado(), 3);
    }

    public double getPeso(){
        return getVolume() * getPesoEspecifico();
    }

    public double getCusto(){
        return getPeso() * getValorKilo();
    }
}
