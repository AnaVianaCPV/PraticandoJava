package Minterfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");

    }

    @Override
    public void imprimir() {
        System.out.println("Carregou");

    }
}
