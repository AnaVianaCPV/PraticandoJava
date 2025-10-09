package Aintroducaoclasses.test;
import Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro carro= new Carro();
        Carro carro2= new Carro();

        carro.nome="Renault Duster";
        carro.modelo="SUV";
        carro.ano=2008;


        carro2.nome="Fiat Uno";
        carro2.modelo="Fire";
        carro2.ano=2012;


        System.out.println("-------------------------");
        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("-------------------------");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
        System.out.println("-------------------------");
    }
}
