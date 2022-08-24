package BancoDigitalJava;

public class Operacao {
    public static void main(String[] args) {
        Cliente Natasha = new Cliente();
        Natasha.setNome("Natasha");


        Conta cc = new ContaCorrente(Natasha);

        Conta poupanca = new ContaPoupanca(Natasha);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}