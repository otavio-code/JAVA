import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setRaio(0.0127);
        circulo.setComprimento(6);
        circulo.setMaterial("Aço");
        circulo.setPesoEspecifico(7800);
        circulo.setValorKilo(3);

        System.out.println(circulo.getMaterial());
        System.out.printf("Peso do material: %.2f \n", circulo.getPeso());
        System.out.printf("Custo do material: %s \n", NumberFormat.getCurrencyInstance().format(circulo.getCusto()));

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(1);
        quadrado.setMaterial("Areia");
        quadrado.setPesoEspecifico(1300);
        quadrado.setValorKilo(0.06);

        System.out.println(quadrado.getMaterial());
        System.out.printf("Peso do material: %.2f \n", quadrado.getPeso());
        System.out.printf("Custo do material: %s \n", NumberFormat.getCurrencyInstance().format(quadrado.getCusto()));

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(0.00635);
        retangulo.setAltura(0.02);
        retangulo.setComprimento(6);
        retangulo.setMaterial("Aço Carbono");
        retangulo.setPesoEspecifico(2400);
        retangulo.setValorKilo(0.62);

        System.out.println(retangulo.getMaterial());
        System.out.printf("Peso do material: %.2f \n", retangulo.getPeso());
        System.out.printf("Custo do material: %s \n", NumberFormat.getCurrencyInstance().format(retangulo.getCusto()));


    }
}