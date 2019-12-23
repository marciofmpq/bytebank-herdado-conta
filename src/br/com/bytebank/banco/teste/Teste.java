package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
//        String dado = "040.969.123-28";

        Object cc = new ContaCorrente(69,123);
        Object cp = new ContaPoupanca(123,196);

        System.out.println(cc);
        System.out.println(cp);

//        dado = dado.replaceAll("[^0-9]+", "");

//        System.out.println(dado);

    }
}
