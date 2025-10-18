package Bintroducaometodos.test;

import Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(10, 20);
        System.out.println(result);
        System.out.println(calculadora.divisaoUm(20, 0));
        System.out.println("_____________________");
        calculadora.imprimeDivisaoDois(86, 0);
    }
}