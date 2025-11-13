package Gassociacao.teste;

import Gassociacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Angelo");
        Jogador jogador2 = new Jogador("Marcelo");
        Jogador jogador3 = new Jogador("Roger");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
