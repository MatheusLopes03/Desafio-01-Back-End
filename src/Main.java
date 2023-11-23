package src;

import src.model.Cliente;
import src.model.Endereco;
import src.model.Pessoa;
import src.model.Vendedor;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 12, "X", "Valenca", "Casa 2");
        Endereco endereco2 = new Endereco("Rua B", 13, "Y", "Sao Paulo", "Apt 12");

        Pessoa pessoa1 = new Cliente("Jorge", "133245367896", "24 998385472,", "Masculino", endereco1);
        Pessoa pessoa2 = new Vendedor("Maria", "98765432145", "24 997685471,", "Feminino", endereco2);

        pessoa1.seApresentar();
        pessoa2.seApresentar();

    }
}