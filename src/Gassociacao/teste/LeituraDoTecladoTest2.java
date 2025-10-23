package Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite sua pergunta e responderei o que penso SIM ou NÃO (ou digite 'sair' para terminar):");
            String pergunta = input.nextLine();


            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por jogar! Até a próxima.");
                break;
            }

            if (pergunta.length() > 0 && pergunta.charAt(0) == ' ') {
                System.out.println(" Sim ");
            } else {
                System.out.println(" Não ");
            }
        }

        input.close();
    }

}