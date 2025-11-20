package Lclassesabstratas.test;

import Lclassesabstratas.domain.Desenvolvedor;
import Lclassesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jorge", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Rita", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
