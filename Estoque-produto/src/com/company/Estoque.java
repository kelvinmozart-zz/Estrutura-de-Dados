package com.company;

import java.util.Arrays;

public class Estoque {

    private Produto[] produtos = new Produto[100];
    private int quantidade = 0;

    public void adiciona(Produto produto){
        this.produtos[this.quantidade] = produto;
        this.quantidade++;
    }/*
    public void adiciona(int posicao, Produto produto){

    }
    public Produto pega(int posicao){

    }
    public void remove(int posicao){

    }*/
    public boolean contem(Produto produto){
        for (int i=0; i<this.quantidade; i++){
            if ( produto.equals(this.produtos[i]) ){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.quantidade;
    }
    public String toString(){
        if ( this.quantidade == 0 ){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i=0; i<this.quantidade-1; i++){
            builder.append(this.produtos[i]);
            builder.append(", ");
        }
        builder.append(this.produtos[this.quantidade-1]);
        builder.append("]");

        return builder.toString();
    }
}
