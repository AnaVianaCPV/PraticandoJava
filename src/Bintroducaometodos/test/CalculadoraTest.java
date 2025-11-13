package Bintroducaometodos.test;

import Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("Finalizando");

        calculadora.subtrairDoisNumeros();

    }
}