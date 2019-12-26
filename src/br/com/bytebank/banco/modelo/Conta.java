package br.com.bytebank.banco.modelo;

public abstract class Conta {
    protected double saldo;
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
//        System.out.println("Total de Contas : " + br.com.bytebank.banco.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Criando br.com.bytebank.banco.modelo.Conta número : " + this.numero);

    }

    public abstract void deposita(double valor);


    public void saca(double valor) throws SaldoInsuficienteException{

        if (this.saldo < valor){
            throw new SaldoInsuficienteException("O Saldo: " + this.saldo + ", Valor: " + valor);
        }else {
        this.saldo -= valor;
        }
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

        /*public void setNumero(int novoNumero){
            if (novoNumero <=0 ){
                System.out.println("Valor de br.com.bytebank.banco.modelo.Conta não permitido");
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

//    public boolean ehIgual(Conta outra){
//        if (this.agencia != outra.agencia){
//            return false;
//        }
//        if (this.numero != outra.numero){
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "Numero : " + this.numero + " Agencia : " + this.agencia;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia){
            return false;
        }
        if (this.numero != outra.numero){
            return false;
        }
        return true;
    }
}
