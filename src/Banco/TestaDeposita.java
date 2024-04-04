package Banco;

public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca(0,0,0);
        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
