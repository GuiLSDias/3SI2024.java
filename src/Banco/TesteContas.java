package Banco;

public class TesteContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(0,0,0);
        ContaCorrente cc = new ContaCorrente(100,1000,10);
        ContaPoupanca cp = new ContaPoupanca(100,1000,12);
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
