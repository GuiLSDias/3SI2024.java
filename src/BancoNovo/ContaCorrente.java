package BancoNovo;

public class ContaCorrente implements ContaTributavel{
    private double saldo;
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    public void atualiza(double taxa){
        double rendimento = getSaldo() * taxa;
        deposita(rendimento);

    }

    @Override
    public double getSaldo() {
        return 0;
    }

    public void deposita(double valor){
        deposita(valor - 1);

    }

    @Override
    public void retira(double valor) {

    }

    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }

}
