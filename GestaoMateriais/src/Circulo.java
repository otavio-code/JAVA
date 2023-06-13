public class Circulo extends GestaoMateriais{
    private double raio;
    private double comprimento;
    private String material;
    private double PesoEspecifico;
    private double valorKilo;

    public Circulo(int id,double raio, double comprimento, String material, double pesoEspecifico, double valorKilo) {
        setId(id);
        this.raio = raio;
        this.comprimento = comprimento;
        this.material = material;
        PesoEspecifico = pesoEspecifico;
        this.valorKilo = valorKilo;
    }

    public double getValorKilo() {
        return valorKilo;
    }

    public void setValorKilo(double valorKilo) {
        this.valorKilo = valorKilo;
    }

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

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(getRaio(),2);
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
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", comprimento=" + comprimento +
                ", material='" + material + '\'' +
                ", pesoEspecifico=" + PesoEspecifico +
                ", valorKilo=" + valorKilo +
                '}';
    }
}
