public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(69,35789);
        conta.deposita(200.0);
        conta.saca(210);

        System.out.println(conta.getSaldo());
    }
}
