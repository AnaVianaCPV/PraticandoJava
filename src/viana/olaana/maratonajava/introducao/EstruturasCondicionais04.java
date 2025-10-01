package viana.olaana.maratonajava.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 40000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorImposto;

        if (salario <= 34712) {
            valorImposto = salario * taxa1;
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * taxa2;
        } else {
            valorImposto = salario * taxa3;
        }
        System.out.println(valorImposto);
    }
}
        /*double salario = 40000;
        String taxa9 = "Tem que pagar taxa de 9,70%";
        String taxa37 = "Tem que pagar taxa de 37,35%";
        String taxa49 = "Tem que pagar taxa de 49,50%";
        String resultado;

        if (salario < 37713) {
            resultado = taxa9;
        } else if (salario >= 37713 && salario <= 68507) {
            resultado = taxa37;
        } else {
            resultado = taxa49;
        }
        System.out.println(resultado);

    }
}
*/