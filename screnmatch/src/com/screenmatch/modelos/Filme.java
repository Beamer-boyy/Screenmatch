package com.screenmatch.modelos;

import coom.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public String diretor; 

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) ObterMedia() / 2; 
    }
    

}