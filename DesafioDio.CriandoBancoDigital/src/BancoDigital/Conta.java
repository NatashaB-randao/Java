package BancoDigital;

import static java.lang.String.format;

public abstract class Conta implements iConta {
    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void ImprimirInfosComuns() {
        System.out.println(format("Agencia: %s", this.agencia));
        System.out.println(format("Titular: %d", this.cliente.getNome()));
        System.out.println(format("Numero: %d", this.numero));
        System.out.println(format("Saldo: %.2f", this.saldo));
    }


}
