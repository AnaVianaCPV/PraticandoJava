package Minterfaces.domain;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados");
    }

    @Override
    public void imprimir() {
        System.out.println("Dados carregados");
    }
}
