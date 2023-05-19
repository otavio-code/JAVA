public class Funcionario {
    String nome;
    String cargo;
    double salario;
    String data_admissao;
    String departamento;
    double total_vendas;

    public double CalculaSalario(double salario, double total_vendas){
        this.salario = salario;
        this.total_vendas = total_vendas;
        if (total_vendas > 50000){
            this.salario = this.salario * 1.4;
            return this.salario;
        }else if(total_vendas > 30000 && total_vendas <= 50000){
            this.salario = this.salario * 1.2;
            return this.salario;
        }else if(total_vendas > 20000 && total_vendas <= 30000){
            this.salario = this.salario * 1.1;
            return this.salario;
        }else{
            return salario;
        }
    }
}
