package BancoNovo;

public class ContaPoupanca implements Conta{
    private double saldo;
    public ContaPoupanca(double saldo) {
        this.saldo = saldo;

    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void deposita(double valor) {

    }

    @Override
    public void retira(double valor) {

    }

    @Override
    public void atualiza(double taxa) {
        double rendimento = getSaldo() * taxa;
        deposita(rendimento);

    }
}
