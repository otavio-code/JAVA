import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
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

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar material");
            System.out.println("2 - Deletar material");
            System.out.println("3 - Alterar material");
            System.out.println("4 - Pesquisar material");
            System.out.println("5 - Preço total");
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
                        System.out.println("Digite o valor do kilo: ");
                        valor_kilo = scanner.nextDouble();
                        Circulo circulo = new Circulo(id, raio, comprimento, material, peso_especifico, valor_kilo);
                        materiais.add(circulo);
                        System.out.println("Material adicionado com sucesso!");
                    } else if (opcao == 2) {
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

                    } else if (opcao == 3) {
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
                        System.out.println("Digite o valor do kilo: ");
                        valor_kilo = scanner.nextDouble();
                        Retangulo retangulo = new Retangulo(id, base, altura, comprimento, material, peso_especifico, valor_kilo);
                        materiais.add(retangulo);
                        System.out.println("Material adicionado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o ID do item a ser atualizado: ");
                    int idRemover = scanner.nextInt();
                    GestaoMateriais itemRemover = null;
                    for (GestaoMateriais item : materiais) {
                        if (item.getId() == idRemover) {
                            itemRemover = item;
                            materiais.remove(itemRemover);
                            break;
                        }
                    }
                    System.out.println("Material removido com sucesso!");
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
                        System.out.println("Digite as novas informações:");
                        if (itemAtualizar instanceof Circulo) {
                            Circulo circuloAtualizar = (Circulo) itemAtualizar;
                            System.out.println("Digite o novo raio: ");
                            double novoRaio = scanner.nextDouble();
                            circuloAtualizar.setRaio(novoRaio);

                            System.out.println("Digite o novo comprimento: ");
                            double novoComprimento = scanner.nextDouble();
                            circuloAtualizar.setComprimento(novoComprimento);

                            System.out.println("Digite o novo valor do kilo: ");
                            double novoValorKilo = scanner.nextDouble();
                            circuloAtualizar.setValorKilo(novoValorKilo);
                        } else if (itemAtualizar instanceof Quadrado) {
                            Quadrado quadradoAtualizar = (Quadrado) itemAtualizar;
                            System.out.println("Digite o novo comprimento: ");
                            double novoLado = scanner.nextDouble();
                            quadradoAtualizar.setLado(novoLado);

                            System.out.println("Digite o novo valor do kilo: ");
                            double novoValorKilo = scanner.nextDouble();
                            quadradoAtualizar.setValorKilo(novoValorKilo);
                        } else if (itemAtualizar instanceof Retangulo) {
                            Retangulo retanguloAtualizar = (Retangulo) itemAtualizar;
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

                case 4:
                    System.out.println("Itens na lista:");
                    for (GestaoMateriais item : materiais) {
                        System.out.println("ID: " + item.getId());
                        System.out.println(item.toString());
                        System.out.println();
                    }
                    break;
                case 5:
                    double somatoriaCusto = 0;

                    for (GestaoMateriais item : materiais) {
                        somatoriaCusto += item.calcularCusto();
                    }

                    System.out.print("Deseja aplicar um desconto? (S/N): ");
                    String opcaoDesconto = scanner.next();



                    if (opcaoDesconto.equalsIgnoreCase("S")) {
                        System.out.print("Informe o valor do desconto (%): ");
                        double desconto = scanner.nextDouble();
                        double valorDesconto = somatoriaCusto * (desconto / 100);
                        somatoriaCusto -= valorDesconto;
                    }

                    String somatoriaCustoFormatada = decimalFormat.format(somatoriaCusto);
                    System.out.println("Somatória do custo de todos os produtos: R$" + somatoriaCustoFormatada);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0) ;
    }
}
