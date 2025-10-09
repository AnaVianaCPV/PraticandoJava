package Aintroducaoclasses.test;

import Aintroducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante estudante= new Estudante();

        estudante.nome="Ana";
        estudante.idade=22;
        estudante.sexo='F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
