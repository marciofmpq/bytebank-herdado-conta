public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(69,1234);
        cc.deposita(200.00);

        ContaPoupanca cp = new ContaPoupanca(69,012);
        cp.deposita(170.00);

        cc.transfere(15,cp);
        cc.saca(20.00);

        System.out.println("CC : " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
