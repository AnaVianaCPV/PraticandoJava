package Gassociacao.teste;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Harley");
        Time time1 = new Time("Brasil");
        jogador1.imprime();

        jogador1.setTime(time1);

    }
}