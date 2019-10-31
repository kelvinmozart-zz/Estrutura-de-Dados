package com.company;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.setCodigo(123);
        produto2.setCodigo(345);
        produto3.setCodigo(678);

        Estoque lista = new Estoque();

        lista.adiciona(produto1);
        lista.adiciona(produto2);
        lista.adiciona(produto3);

        System.out.println(lista);
    }
}
