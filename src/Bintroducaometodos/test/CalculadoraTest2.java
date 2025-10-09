package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(10, 20);
        System.out.println(result);

    }
}