public class ContaCorrente extends Conta {


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.20);
    }

    @Override
    public boolean transfere(double valor, Conta destino) {
        return super.transfere(valor + 0.10, destino);
    }
}
