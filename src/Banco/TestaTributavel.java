package Banco;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0,0,0);
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
// testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
