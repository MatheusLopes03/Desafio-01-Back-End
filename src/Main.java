package src;

import src.model.Endereco;
import src.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 12, "X", "Valenca", "Casa 2");
        Endereco endereco2 = new Endereco("Rua B", 13, "Y", "Sao Paulo", "Apt 12");
        Endereco endereco3 = new Endereco("Rua C", 14, "Z", "Rio de Janeiro", "Apt 4");

        Pessoa pessoa1 = new Pessoa("Jorge", "133245367896", "24 998385472,", "Masculino", endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", "98765432145", "24 997685471,", "Feminino", endereco2);
        Pessoa pessoa3 = new Pessoa("Cleiton", "043247367096", "24 990082492,", "Masculino", endereco3);

        pessoa1.seApresentar();
        pessoa2.seApresentar();
        pessoa3.seApresentar();
    }
}
