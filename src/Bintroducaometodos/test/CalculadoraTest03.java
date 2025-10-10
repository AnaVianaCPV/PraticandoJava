package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args){
        Calculadora calculadora= new Calculadora();

        int a =22;
        int b =33;

        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro da Calculadora Test03");
        System.out.println("Num1 " +a);
        System.out.println("Num2 " +b);
    }
}
