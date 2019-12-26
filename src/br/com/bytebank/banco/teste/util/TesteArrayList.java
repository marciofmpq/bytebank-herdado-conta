package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(69,112);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(69,224);
        lista.add(cc2);

        System.out.println("Tamanho : " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho : " + lista.size());

        Conta cc3 = new ContaCorrente(69,459);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(69,259);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("=========================================");
        for (Object o : lista){
            System.out.println(o);
        }

    }
}
