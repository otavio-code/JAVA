public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo1 = new Circulo();
        ((Circulo) circulo1).setRaio(8);
        ((Circulo) circulo1).setComprimento(3);

        System.out.println("Dados de um circulo: ");
        System.out.printf("AREA: %.2f m² \n", circulo1.area());
        System.out.printf("PERIMETRO: %.2f m² \n", circulo1.perimetro());
        System.out.printf("VOLUME: %.2f m³ \n", circulo1.volume());

        FormaGeometrica quadrado1 = new Quadrado();
        ((Quadrado) quadrado1).setLado(8);
        ((Quadrado) quadrado1).setComprimento(3);

        System.out.println("Dados de um quadrado: ");
        System.out.printf("AREA: %.2f m² \n", quadrado1.area());
        System.out.printf("PERIMETRO: %.2f m² \n", quadrado1.perimetro());
        System.out.printf("VOLUME: %.2f m³ \n", quadrado1.volume());
    }
}