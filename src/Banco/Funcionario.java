package Banco;

public class Funcionario extends Pessoa {

    private double salario, bonificacao;

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Funcionario(String nome, String cpf, double salario){
        super(nome, cpf);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
