package Minterfaces.domain;

public interface DataLoader {

    void load();

    void imprimir();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

}
