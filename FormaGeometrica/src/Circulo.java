public class Circulo implements FormaGeometrica{
    private double raio;
    private double comprimento;

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

    @Override
    public double area() {
        return Math.PI * Math.pow(getRaio(),2);
    }

    @Override
    public double perimetro() {
        return Math.PI * 2 * getRaio();
    }

    @Override
    public double volume() {
        return area() * getComprimento();
    }
}
