package com.company;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto(15, 3, 123);

        System.out.println("Preço: R$ " + produto1.getPreco() + ", tamanho: " + produto1.getTamanho() + ", codigo: " + produto1.getCodigo() );
        System.out.println(produto1.getQuantidadeMinima());
    }
}
