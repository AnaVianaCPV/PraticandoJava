package Hheranca.test;

import Hheranca.domain.Endereco;
import Hheranca.domain.Funcionario;
import Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Treze");
        endereco.setCep("07777-000");

        Pessoa pessoa = new Pessoa("Julia");
        pessoa.setCpf("555.555.555-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("--------------");

        Funcionario funcionario = new Funcionario("Julia");
        funcionario.setCpf("555.555.555-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();


    }
}
