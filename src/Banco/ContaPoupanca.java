package Banco;

public class ContaPoupanca extends Conta{
    private double saldo;
    public ContaPoupanca(double saldo, double limite, int numero) {
        super(saldo, limite, numero);
    }

    @Override
    void atualiza(double taxa) {
        double rendimento = getSaldo() * taxa;
        deposita(rendimento);

    }

    /*public void atualiza(double taxa){
        double rendimento = getSaldo() * taxa;
        deposita(rendimento);
        //this.saldo += this.saldo * taxa;
    }*/

}
