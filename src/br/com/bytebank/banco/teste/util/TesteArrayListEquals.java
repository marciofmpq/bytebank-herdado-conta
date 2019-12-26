package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(69,112);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(69,224);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(69,224);

        boolean existe = lista.contains(cc3);

        System.out.println("Checagem : " + existe);

        for (Object conta : lista){
            System.out.println(conta);
        }

    }
}
