package Kenumeracao.test;

import Kenumeracao.domain.Cliente;
import Kenumeracao.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jorge ", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("Jorge ", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Jorge ", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);

    }

}
