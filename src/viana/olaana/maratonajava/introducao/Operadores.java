package viana.olaana.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println("Resuldado " + resultado );

        int resto = 21 % 7;
        System.out.println(resto);

        boolean dezMaiorQueVinte = 10>20;
        boolean dezMenorQueVinte = 10<20;
        boolean dezIgualQueVinte = 10==20;
        boolean dezIgualQueDez = 10==10;
        boolean dezDiferenteQueVinte = 10!=20;
        System.out.println(dezMaiorQueVinte);
        System.out.println(dezMenorQueVinte);
        System.out.println(dezIgualQueVinte);
        System.out.println(dezIgualQueDez);
        System.out.println(dezDiferenteQueVinte);

        int idade = 28;
        float salario = 3500;
        boolean salarioDentroDaLeiMaiorQueTrinta = idade>30 && salario>=4600;
        boolean salarioDentroDaLeiMenorQueTrinta = idade<30 && salario>=3300;
        System.out.println(salarioDentroDaLeiMaiorQueTrinta);
        System.out.println(salarioDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean comprarPlaystation = valorTotalContaCorrente > valorPlaystation
                                  || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(comprarPlaystation);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 1000;
        System.out.println(bonus);
        
        int contador=0;
        contador+= 1;
        contador--= 1;
        contador++= 1;
        System.out.println(contador);
    }
}

