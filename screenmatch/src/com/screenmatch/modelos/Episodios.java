package com.screenmatch.modelos;

import com.screenmatch.calculadora.Classificavel;

public class Episodios implements Classificavel{
    private int numero;
    private String nome; 
    private Serie serie; 
    private int totalDeAvaliacoes; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public int getClassificacao(){
        if (totalDeAvaliacoes > 100) {
            return 4; 
        } else{
            return 2;
        }
    }
}


