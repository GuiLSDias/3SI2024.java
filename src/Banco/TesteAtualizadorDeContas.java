package Banco;

public class TesteAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(0,0,0);
        Conta cc = new ContaCorrente(0,0,0);
        Conta cp = new ContaPoupanca(0,0,0);
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}

