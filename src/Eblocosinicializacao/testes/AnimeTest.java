package Eblocosinicializacao.testes;

import Eblocosinicializacao.metodos.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodios : anime.getEpisodios())
            System.out.print(episodios + " ");

    }
}
