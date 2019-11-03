package com.company;

public class Estoque {

    private Produto[] produtos = new Produto[100];
    private int quantidade = 0;

    public void adiciona(Produto produto){
        this.garantaEspaco();
        this.produtos[this.quantidade] = produto;
        this.quantidade++;
    }
    public void adiciona(int posicao, Produto produto){
        this.garantaEspaco();
        if( !this.posicaoValida(posicao) ){
            throw new IllegalArgumentException("Posição innválida");
        }
        for(int i=this.quantidade-1; i>=posicao; i-=1){
            this.produtos[i+1] = this.produtos[i];
        }
        this.produtos[posicao] = produto;
        this.quantidade++;
    }
    private void garantaEspaco(){
        if( this.quantidade == this.produtos.length ){
            Produto[] novaArray = new Produto[this.produtos.length*2];
            for(int i=0; i<this.produtos.length; i++){
                novaArray[i] = this.produtos[i];
            }
            this.produtos = novaArray;
        }
    }
    public void removeProdutoNa(int posicao){
        if( !this.posicaoOcupada(posicao) ){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao; i<this.quantidade-1; i++){
            this.produtos[i] = this.produtos[i+1];
        }
        this.quantidade--;
    }
    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.quantidade;
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.quantidade;
    }
    public Produto pega(int posicao){
        if( !this.posicaoOcupada(posicao) ){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.produtos[posicao];
    }
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
