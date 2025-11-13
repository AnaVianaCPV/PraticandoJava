package Bintroducaometodos.test;

import Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ana");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1000, 5000, 2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());

    }
}
