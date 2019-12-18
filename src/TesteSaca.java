public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(69,35789);
        conta.deposita(200.0);
        try {
            conta.saca(210);
        }catch (SaldoInsuficienteException ex){
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
