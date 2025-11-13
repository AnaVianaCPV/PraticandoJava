package Gassociacao.teste;

import Gassociacao.domain.Escola;
import Gassociacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Larah");
        Professor professor2 = new Professor("Roberto");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Viva Mais", professores);

        escola.imprime();
    }
}