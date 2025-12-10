package Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados");
    }

    @Override
    public void imprimir() {
        System.out.println("Dados carregados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }
}
