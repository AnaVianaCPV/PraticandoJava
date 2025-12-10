package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("H7", 2000);
        Tomate tomate = new Tomate(" Carmen", 20);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}
