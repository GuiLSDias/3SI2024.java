package Banco;

public class TesteConstrutor {
    public static void main(String[] args) {
        Conta z = new ContaCorrente(0,0,0);
        Conta x = new ContaCorrente(7000,0,0);
        Conta y = new ContaCorrente(2000,0,0);
        Conta w = new ContaCorrente(2000, 50000, 12340);
        System.out.println("Saldo x : "+x.getSaldo());
        System.out.println("Saldo y : "+y.getSaldo());

        System.out.println("Total de contas: "+Conta.getTotalDeContas());
        System.out.println("ID: "+x.getIdentificador());

    }
}
