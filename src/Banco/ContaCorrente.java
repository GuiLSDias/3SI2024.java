package Banco;

public class ContaCorrente extends Conta {

    private double saldo;
    public ContaCorrente(double saldo, double limite, int numero) {
        super(saldo, limite, numero);
    }
    public void atualiza(double taxa){
        double rendimento = getSaldo() * taxa;
        deposita(rendimento);

    }
    public void deposita(double valor){
        super.deposita(valor - 1);

    }

}
