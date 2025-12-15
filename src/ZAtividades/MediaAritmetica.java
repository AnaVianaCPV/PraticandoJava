package ZAtividades;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);

        System.out.println("Digite 1 nota: ");
        int nota1 = media.nextInt();
        System.out.println("Digite 2 nota: ");
        int nota2 = media.nextInt();
        System.out.println("Digite 3 nota: ");
        int nota3 = media.nextInt();

        System.out.println("Digite 4 nota: ");
        int nota4 = media.nextInt();
        System.out.println("Digite 5 nota: ");
        int nota5 = media.nextInt();
        System.out.println("Digite 6 nota: ");
        int nota6 = media.nextInt();


        int media123 = (nota1 + nota2 + nota3) / 3;
        System.out.println("1 Média: " + media123);

        int media456 = (nota4 + nota5 + nota6) / 3;
        System.out.println("2 Média: " + media456);

       
        int mediaDasMedias = (media123 + media456) / 2;

        System.out.println("Valor das médias das médias é: " + mediaDasMedias);


    }
}
