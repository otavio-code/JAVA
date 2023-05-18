public class Programa {
    public static void main(String[] args) {

        double aceleracao;
        String frenagem;
        Carro carro = new Carro();
        carro.marca = "Chevrolet";
        carro.modelo = "Onix";
        carro.cor = "Prata";
        carro.quilometragem = 20000;
        carro.tipo_combustivel = "Flex";

        aceleracao = 10.2;
        frenagem = "ABS";

        System.out.println("MARCA: " + carro.marca);
        System.out.println("MODELO: " + carro.modelo);
        System.out.println("COR: " + carro.cor);
        System.out.println("QUILOMETRAGEM: " + carro.quilometragem);
        System.out.println("TIPO COMBUSTÍVEL: " + carro.tipo_combustivel);
        System.out.println(carro.aceleracao(aceleracao));
        System.out.println(carro.frenagem(frenagem));
    }
}