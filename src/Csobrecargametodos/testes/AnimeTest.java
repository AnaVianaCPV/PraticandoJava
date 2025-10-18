package Csobrecargametodos.testes;

import Csobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Inuyasha ", "Animação ", 50, "Adulto", "Doze");

        anime.imprime();


    }
}
