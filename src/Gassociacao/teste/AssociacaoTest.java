package Gassociacao.teste;

import Gassociacao.domain.Aluno;
import Gassociacao.domain.Local;
import Gassociacao.domain.Professor1;
import Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Professor1 professor = new Professor1("Roberto ", "Matemática ");
        Aluno aluno = new Aluno("Julio ", 17);
        Aluno[] alunoParaSeminario = {aluno};
        Local local = new Local("Rua das Laranjeira 201, São Rock -SP ");
        Seminario seminario = new Seminario("Tema Matemática Aplicada ",
                alunoParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
