public class Retangulo {
    double altura;
    double base;
    String cor;
    String material;

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return base * 2 + altura * 2;
    }
}
