package Npolimorfismo.test;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Julian");
        list.add("Kuririn");
        System.out.println(list);
    }
}
