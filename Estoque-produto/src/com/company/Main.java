package com.company;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setCodigo(123);
        produto2.setCodigo(345);

        Estoque lista = new Estoque();

        lista.adiciona(produto1);
        lista.adiciona(produto2);

        System.out.println(lista);
    }
}
