package com.shelton.structuredata.vetor;
public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

            // Adiciona elementos em um vetor
     public void adicionaElemento(String elemento){
        for (int i = 0; i < elementos.length; ++i){
            if (this.elementos[i] == null) this.elementos[i] = elemento;
            break;
        }
     }

    // Adiciona elementos em um vetor, caso esteja cheio lança uma exceção
     public void adiciona(String elemento) throws Exception {
        if(tamanho < elementos.length){
            elementos[tamanho] =elemento;
            tamanho ++;
        }else {
            throw new Exception("Vetor esta cheio!");
        }
     }

        //  Retorna o tamanho de todos elementos ou seja um numero exato de quantos elementos tem no vetor
     public int tamanho(){
        return tamanho;
     }

     // Retorna um elemento  no vetor de acordo com a posicao que o usuario for a  colocar
     public String  ObterElemento(int posicao){
        if(posicao < 0) throw new IllegalArgumentException("Argumento invalido!");
        return elementos[posicao];
     }

}
