package Banco;

abstract class Conta {
    private int numero;
    Cliente objCliente = new Cliente();
    private double saldo;
    private double limite;
    private static int totalDeContas;
    private int identificador;
    private double atualiza;
    private double taxa;
    Conta(){
        System.out.println("Construindo uma conta");
        totalDeContas = totalDeContas + 1;
        this.identificador = totalDeContas;

    }
    Conta(double saldo){
        this();
        this.saldo = saldo;
    }
    Conta(double saldo, double limite, int numero){
        this(saldo);
        this.limite = limite;
        this.numero = numero;
    }
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo+limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade){
       if(this.getSaldo() >= quantidade){
           this.saldo = this.saldo - quantidade;
           System.out.println("Saque realizado com sucesso!");
           return true;
       }else{
           System.out.println("Saldo insuficiente: "+this.getSaldo());
           return false;
       }

   }
    void deposita(double valor){
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.10;
        }
    }

    abstract void atualiza(double taxa);

    public void transfere(Conta destino, double quantidade) {
       if (this.saca(quantidade)) {
           destino.deposita(quantidade);
       } else {
           System.out.println("Saldo Insuficiente: "+this.getSaldo());
       }

   }
}
