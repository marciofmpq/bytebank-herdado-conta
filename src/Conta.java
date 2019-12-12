public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    public Conta (int agencia, int numero){
        Conta.total++;
//        System.out.println("Total de Contas : " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Criando Conta número : " + this.numero);

    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

        /*public void setNumero(int novoNumero){
            if (novoNumero <=0 ){
                System.out.println("Valor de Conta não permitido");
            }
            this.numero = novoNumero;
            }*/

    public int getAgencia() {
        return agencia;
    }

        /*public void setAgencia(int agencia) {
            if (agencia <= 0){
                System.out.println("Numero de Agencia não permitido");
            }
            this.agencia = agencia;
            }*/

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
