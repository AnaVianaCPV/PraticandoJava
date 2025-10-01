package viana.olaana.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args){
        int idade=17;
        String categoria;

        if(idade<15){
            categoria="Criança";
        }
        else if(idade>=15 && idade<18){
            categoria="Jovem";
        }
        else {
            categoria="Adulto";
        }
        System.out.println(categoria);
    }
}