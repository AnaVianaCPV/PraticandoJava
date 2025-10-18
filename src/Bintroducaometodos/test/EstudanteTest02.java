package Bintroducaometodos.test;

import Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Ana";
        estudante.idade = 22;
        estudante.sexo = 'F';

        estudante1.nome = "Julia";
        estudante1.idade = 33;
        estudante1.sexo = 'F';

        estudante.imprime();
        estudante1.imprime();
    }
}
