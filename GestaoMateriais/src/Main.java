import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<GestaoMateriais> materiais = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int id;
        double raio;
        double comprimento;
        String material;
        int peso_especifico;
        double valor_kilo;
        double base;
        double altura;

        int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar material");
            System.out.println("2 - Deletar material");
            System.out.println("3 - Alterar material");
            System.out.println("4 - Pesquisar material");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o formato do material a ser adicionado: ");
                    System.out.println("1 - Circulo");
                    System.out.println("2 - Quadrado");
                    System.out.println("3 - Retangulo");
                    opcao = scanner.nextInt();
                    if (opcao == 1) {
                        System.out.println("Informe o ID do produto: ");
                        id = scanner.nextInt();
                        System.out.println("Digite o raio: ");
                        raio = scanner.nextDouble();
                        System.out.println("Digite o comprimento: ");
                        comprimento = scanner.nextDouble();
                        System.out.println("Digite o material: ");
                        material = scanner.next();
                        System.out.println("Digite o peso específico: ");
                        peso_especifico = scanner.nextInt();
                        System.out.println("Digite o peso específico: ");
                        valor_kilo = scanner.nextDouble();
                        Circulo circulo = new Circulo(id, raio, comprimento, material, peso_especifico, valor_kilo);
                        materiais.add(circulo);
                        System.out.println("Material adicionado com sucesso!");
                    }else if (opcao == 2){
                        System.out.println("Informe o ID do produto: ");
                        id = scanner.nextInt();
                        System.out.println("Digite o comprimento: ");
                        comprimento = scanner.nextDouble();
                        System.out.println("Digite o material: ");
                        material = scanner.next();
                        System.out.println("Digite o peso específico: ");
                        peso_especifico = scanner.nextInt();
                        System.out.println("Digite o valor do kilo: ");
                        valor_kilo = scanner.nextDouble();
                        Quadrado quadrado = new Quadrado(id, comprimento, material, peso_especifico, valor_kilo);
                        materiais.add(quadrado);
                        System.out.println("Material adicionado com sucesso!");

                }else if (opcao == 3) {
                        System.out.println("Informe o ID do produto: ");
                        id = scanner.nextInt();
                        System.out.println("Digite a base: ");
                        base = scanner.nextDouble();
                        System.out.println("Digite o altura: ");
                        altura = scanner.nextDouble();
                        System.out.println("Digite o comprimento: ");
                        comprimento = scanner.nextDouble();
                        System.out.println("Digite o material: ");
                        material = scanner.next();
                        System.out.println("Digite o peso específico: ");
                        peso_especifico = scanner.nextInt();
                        System.out.println("Digite o peso específico: ");
                        valor_kilo = scanner.nextDouble();
                        Retangulo retangulo = new Retangulo(id, base, altura, comprimento, material, peso_especifico, valor_kilo);
                        materiais.add(retangulo);
                        System.out.println("Material adicionado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o índice do objeto a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < materiais.size()) {
                        materiais.remove(indiceRemover);
                        System.out.println("Material removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:

                    System.out.print("Digite o ID do item a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    GestaoMateriais itemAtualizar = null;
                    for (GestaoMateriais item : materiais) {
                        if (item.getId() == idAtualizar) {
                            itemAtualizar = item;
                            break;
                        }
                    }
                    if (itemAtualizar != null) {
                        System.out.println("Item selecionado:");
                        itemAtualizar.toString();
                        System.out.println();
                        System.out.println("Digite as novas informações:");


                        System.out.println("Digite as novas informações:");
                            if (item instanceof Circulo) {
                                Circulo circuloAtualizar = (Circulo) item;
                                System.out.println("Digite o novo raio: ");
                                double novoRaio = scanner.nextDouble();
                                circuloAtualizar.setRaio(novoRaio);

                                System.out.println("Digite o novo comprimento: ");
                                double novoComprimento = scanner.nextDouble();
                                circuloAtualizar.setComprimento(novoComprimento);

                                System.out.println("Digite o novo valor do kilo: ");
                                double novoValorKilo = scanner.nextDouble();
                                circuloAtualizar.setValorKilo(novoValorKilo);
                            } else if (item instanceof Quadrado) {
                                Quadrado quadradoAtualizar = (Quadrado) item;
                                System.out.println("Digite o novo comprimento: ");
                                double novoLado = scanner.nextDouble();
                                quadradoAtualizar.setLado(novoLado);

                                System.out.println("Digite o novo valor do kilo: ");
                                double novoValorKilo = scanner.nextDouble();
                                quadradoAtualizar.setValorKilo(novoValorKilo);
                            } else if (item instanceof Retangulo) {
                                Retangulo retanguloAtualizar = (Retangulo) item;
                                System.out.println("Digite a nova base: ");
                                double novoBase = scanner.nextDouble();
                                retanguloAtualizar.setBase(novoBase);

                                System.out.println("Digite a nova altura: ");
                                double novoAltura = scanner.nextDouble();
                                retanguloAtualizar.setAltura(novoAltura);

                                System.out.println("Digite o novo comprimento: ");
                                double novoComprimento = scanner.nextDouble();
                                retanguloAtualizar.setComprimento(novoComprimento);

                                System.out.println("Digite o novo valor do kilo: ");
                                double novoValorKilo = scanner.nextDouble();
                                retanguloAtualizar.setValorKilo(novoValorKilo);
                            }
                            System.out.println("Item atualizado com sucesso!");
                        } else {
                            System.out.println("id inválido!");
                        }
                        break;
                    }
                case 4:
                    System.out.println("Itens na lista:");
                    for (GestaoMateriais item : materiais) {
                        System.out.println("ID: " + item.getId());
                        System.out.println(item.toString());
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
