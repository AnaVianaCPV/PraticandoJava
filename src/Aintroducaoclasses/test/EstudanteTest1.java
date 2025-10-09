package Aintroducaoclasses.test;

import Aintroducaoclasses.domain.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante= new Estudante();
        Estudante estudante1= new Estudante();

        estudante.nome="Ana";
        estudante.idade=22;
        estudante.sexo='F';

        estudante1.nome="Carla";
        estudante1.idade=33;
        estudante1.sexo='F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-----------");

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);


    }
}
