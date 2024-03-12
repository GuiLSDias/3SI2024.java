package sintaxe;

public class TesteOperacoes {
    public static void main(String[] args) {
        Operacoes objOperacoes = new Operacoes();
        //objOperacoes.n1 = 10;
        //objOperacoes.n2 = 10;
        //objOperacoes.soma(10,10);
        double result = objOperacoes.soma(50,50);
        System.out.println("Resultado: "+result);
        System.out.println("Resultado: "+objOperacoes.soma(20, 20));

        Operacoes objOperacoes2 = new Operacoes();
        //objOperacoes2.n1 = 100;
        //objOperacoes2.n2 = 20;
        objOperacoes.soma(100,20);

        System.out.println(objOperacoes);
        System.out.println(objOperacoes2);
    }
}
