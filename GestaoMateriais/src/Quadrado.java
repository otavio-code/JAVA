public class Quadrado extends GestaoMateriais{
    private double lado;
    private String material;
    private double PesoEspecifico;
    private double valorKilo;

    public Quadrado(int id, double lado, String material, double PesoEspecifico, double valorKilo) {
        setId(id);
        this.lado = lado;
        this.material = material;
        this.PesoEspecifico = PesoEspecifico;
        this.valorKilo = valorKilo;
    }

    public double getPesoEspecifico() {
        return PesoEspecifico;
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

    public double getVolume() {
        return Math.pow(getLado(), 3);
    }

    public double getPeso(){
        return getVolume() * getPesoEspecifico();
    }

    public double getCusto(){
        return getPeso() * getValorKilo();
    }
    public double calcularCusto() {
        return getCusto();
    }

    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", material='" + material + '\'' +
                ", pesoEspecifico=" + PesoEspecifico +
                ", valorKilo=" + valorKilo +
                '}';
    }
}
