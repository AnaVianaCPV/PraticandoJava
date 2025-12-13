package ZAtividades;

import java.util.Scanner;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/
public class CalculadoraDias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos anos: ");
        int anos = leitor.nextInt();

        System.out.println("Digite os meses: ");
        int meses = leitor.nextInt();

        System.out.println("Digite os dias: ");
        int dias = leitor.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade total em dias é: " + totalDias);
    }
}
