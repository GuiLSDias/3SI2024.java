package Banco;

import java.sql.SQLOutput;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario("Giulio", "1616161", 100);
        Gerente objGerente = new Gerente("João","131321313", 100 );
        Diretor objDiretor = new Diretor("Jr", "5165919161", 100);

        System.out.println("Nome funcionario: "+objFuncionario.getNome());
        System.out.println("Nome gerente: "+objGerente.getNome());
        System.out.println("Nome diretor: "+objDiretor.getNome());

        System.out.println("Bonus: "+objFuncionario.getBonificacao());
        System.out.println("Bonus gerente: "+objGerente.getBonificacao());
    }
}
