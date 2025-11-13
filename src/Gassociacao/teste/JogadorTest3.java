package Gassociacao.teste;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vitor");
        Jogador jogador2 = new Jogador("Josué");
        Time time = new Time("Maratona");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------Jogadores-------");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("------Time-------");
        time.imprime();
    }
}
