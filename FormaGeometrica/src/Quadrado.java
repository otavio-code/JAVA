public class Quadrado implements FormaGeometrica{
    private double lado;

    private double comprimento;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public double perimetro() {
        return getLado() * 4;
    }

    @Override
    public double volume() {
        return area() * getComprimento();
    }
}
