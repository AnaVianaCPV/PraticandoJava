package Bintroducaometodos.test;
import Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
          Funcionario funcionario= new Funcionario();
          funcionario.nome="Ana";
          funcionario.idade=25;
          funcionario.salarios=new double[] {1000,5000,2000};

          funcionario.imprime();

    }
}
