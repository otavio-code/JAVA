public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Otávio Andrade";
        funcionario.cargo = "Engenheiro de Software Pleno";
        funcionario.departamento = "TI";
        funcionario.data_admissao = "10/12/2021";
        funcionario.salario = 1800.34;
        funcionario.total_vendas = 56000;

        System.out.printf("O salário considerando as vendas: " + "R$ %.2f", funcionario.CalculaSalario(funcionario.salario, funcionario.total_vendas));
    }
}