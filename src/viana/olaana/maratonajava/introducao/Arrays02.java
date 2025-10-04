package viana.olaana.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        //int, double, short, long, float e double - 0
        //Strinf null
        //boolean false
        //char '\u0000'
        String[] nomes = new String[3];
        nomes[0] = "Jujuh";
        nomes[1] = "Penelope";
        nomes[2] = "Suzy";

       // for (int i = 0; i < 3; i++) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
