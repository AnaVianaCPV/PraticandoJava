package Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    public String toString() {
        return "Desenvolvedor nome " + nome + " Salário = " + salario;
    }
}
