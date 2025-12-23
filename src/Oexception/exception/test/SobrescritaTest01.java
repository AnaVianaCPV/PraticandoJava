package Oexception.exception.test;

import Oexception.exception.domain.Funcionario;
import Oexception.exception.domain.LoginInvalidoException;
import Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException("Erro ao salvar funcionário", e);
        }

    }
}
