package com.company;

public class Produto {

    private double preco;
    private int quantidadeMinima;
    private int tamanho;            // 1 = pequeno, 2 = medio, 3 = grande
    private int codigo;

    public Produto(double preco, int tamanho, int codigo) {
        this.preco = preco;
        this.tamanho = tamanho;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeMinima() {
        if( tamanho == 1 ){
            return 100;
        }else if( tamanho == 2 ){
            return 50;
        }else if( tamanho == 3 ){
            return 25;
        }else{
            return 0;
        }
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
