package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante estudante= new Estudante();
        Estudante estudante1=new Estudante();
        ImpressoraEstudante impressora= new ImpressoraEstudante();

        estudante.nome="Ana";
        estudante.idade=22;
        estudante.sexo='F';

        estudante1.nome="Julia";
        estudante1.idade=33;
        estudante1.sexo='F';

        impressora.imprime(estudante);
        impressora.imprime(estudante1);

    }
}
