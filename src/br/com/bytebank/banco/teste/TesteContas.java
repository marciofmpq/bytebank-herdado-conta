package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(69,1234);
        cc.deposita(200.00);

        ContaPoupanca cp = new ContaPoupanca(69,12);
        cp.deposita(170.00);

        cc.transfere(15,cp);
        cc.saca(20.00);

        System.out.println("CC : " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
