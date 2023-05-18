/*Crie uma classe "Retângulo" que
 tenha como atributos a altura,
  a largura, a cor e o material do retângulo,
   e como métodos a área e o perímetro.*/
public class Programa {
    public static void main(String[] args) {
        Retangulo retanguloUm = new Retangulo();

        retanguloUm.base = 15;
        retanguloUm.altura = 10;
        retanguloUm.material = "Madeira";
        retanguloUm.cor = "Marrom";
        System.out.println("BASE: " + retanguloUm.base);
        System.out.println("ALTURA: " + retanguloUm.altura);
        System.out.println("ÁREA: " + retanguloUm.area());
        System.out.println("ÁREA: " + retanguloUm.perimetro());
    }
}