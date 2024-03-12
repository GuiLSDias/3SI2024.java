package Banco;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conta minhaConta = new Conta();
        //minhaConta.cliente = "Guilherme de Lima Souza Dias";
        //minhaConta.saldo = 1000;
        //minhaConta.setCliente("Guilherme de Lima Souza Dias");
        minhaConta.setLimite(20000);
        minhaConta.deposita(1000);
        minhaConta.saca(100);

        System.out.println("Saldo atual: "+minhaConta.getSaldo());
        //System.out.println("Nome cliente: "+minhaConta.getCliente());
        Conta outraConta = new Conta();

    }
}
