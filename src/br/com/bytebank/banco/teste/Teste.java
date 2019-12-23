package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        Object cc = new ContaCorrente(69,123);
        Object cp = new ContaPoupanca(123,196);

        System.out.println(cc);
        System.out.println(cp);

    }
}
