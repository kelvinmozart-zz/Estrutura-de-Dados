package com.company;

public class Produto {

    private double preco;
    private int quantidadeMinima;
    private int tamanho;

    public Produto(double preco, int quantidadeMinima, int tamanho) {
        this.preco = preco;
        this.quantidadeMinima = quantidadeMinima;
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        switch (tamanho){
            case 1:
                this.quantidadeMinima = 50;
                break;
            case 2:
                this.quantidadeMinima = 25;
                break;
            case 3:
                this.quantidadeMinima = 10;
                break;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
