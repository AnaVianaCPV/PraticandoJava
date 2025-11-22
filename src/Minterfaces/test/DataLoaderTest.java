package Minterfaces.test;

import Minterfaces.domain.DataBaseLoader;
import Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        
        dataBaseLoader.load();
        dataBaseLoader.imprimir();


        fileLoader.load();
        fileLoader.imprimir();


    }
}
