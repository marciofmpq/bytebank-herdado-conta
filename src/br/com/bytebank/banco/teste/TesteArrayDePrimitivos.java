package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
/*
Tratamento de String para remover todos os caracteres exceto numericos
        String dado = "040.969.123-28";
        dado = dado.replaceAll("[^0-9]+", "");
        System.out.println(dado);
*/
        int[] idades = new int[5];

        for (int i =0 ; i < idades.length; i++){
            idades[i] = (i * i) + 10;
        }
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
