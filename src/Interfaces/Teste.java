package Interfaces;

public class Teste {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());

        AreaCalculavel q = new Quadrado(4);
        System.out.println(q.calculaArea());

        AreaCalculavel c = new Circulo(5);
        System.out.println(c.calculaArea());
    }
}
