public class Velho extends Imovel{
    public void desconto(double preco){
        double resultado;
        resultado = preco * 0.8;
        System.out.println("O valor final considerando o desconto é de: " + resultado);
    }
}
