public class Novo extends Imovel{
    public void adicional(double preco){
        double resultado;
        resultado = preco * 1.1;
        System.out.println("O valor final considerando o adicional é de: " + resultado);
    }

}
