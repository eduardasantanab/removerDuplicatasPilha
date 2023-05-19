package com.atividade;

import java.util.NoSuchElementException;

public class PilhaEstatica {

    public char[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){
        this.elementos = new char[tamanho];
        this.tamanho = tamanho;
        this.topo = -1;
    }

    public void push(char valor) {
        if(topo == tamanho){
            throw new NoSuchElementException("Erro: a pilha está cheia!");
        }
        topo = topo + 1;
        elementos[topo] = valor;
    }

    public int pop(){
        int remove;

        if(isEmpty()){
            return -1;
        }
        else {
            remove = elementos[topo];
            elementos[topo] = 0;
            topo = topo - 1;
            return remove;
        }
    }

    public boolean isEmpty(){
        if (topo == -1){
            return true;
        }else {
            return false;
        }
    }

    public int peek(){
        if(topo == -1){
            return elementos[0] = 0;
        }else{
            return elementos[topo];
        }
    }
}