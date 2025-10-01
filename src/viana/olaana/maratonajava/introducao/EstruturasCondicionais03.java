package viana.olaana.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args){
        double salario= 5000;
        String mensagemDoar= "Posso doar 500";
        String mensagemNaoDoar= "Não posso doar";
        String resultado;

        if (salario>5000) {
            resultado=mensagemDoar;
        }
        else {
            resultado=mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
