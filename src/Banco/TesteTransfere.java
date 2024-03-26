package Banco;

public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente(0,0,0);
        Conta outraConta = new ContaCorrente(0,0,0);

        minhaConta.deposita(1000);
        outraConta.deposita(1000);

        minhaConta.transfere(outraConta, 500000);

        System.out.println("Saldo minhaConta: "+minhaConta.getSaldo());
        System.out.println("Saldo outraConta: "+outraConta.getSaldo());
    }
}
