package Jmodificadorfinal.test;

import Jmodificadorfinal.domain.Carro;
import Jmodificadorfinal.domain.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}
