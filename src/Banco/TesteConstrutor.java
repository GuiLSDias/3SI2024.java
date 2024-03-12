package Banco;

public class TesteConstrutor {
    public static void main(String[] args) {
        Conta z = new Conta();
        Conta x = new Conta(7000);
        Conta y = new Conta(2000);
        Conta w = new Conta(2000, 50000, 12340);
        System.out.println("Saldo x : "+x.getSaldo());
        System.out.println("Saldo y : "+y.getSaldo());

        System.out.println("Total de contas: "+Conta.getTotalDeContas());
        System.out.println("ID: "+x.getIdentificador());

    }
}
