package Banco;

public class ValorInvalidoException extends RuntimeException{
    ValorInvalidoException(double valor) {
        super( "Valor invalido: "+valor);
    }

}
