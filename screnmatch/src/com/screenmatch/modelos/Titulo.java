package com.screenmatch.modelos;

public class Titulo {
    private String  titulo;  
    private int anoDeLancamento;
    private boolean incluindoNoPlano; 
    private double somaAvaliacao;
    private int totalDeAvaliacoes; 
    private int duracaoEmMinutos;  
    
    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public boolean isIncluindoNoPlano() {
        return incluindoNoPlano;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }
    
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos; 
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    


public void ExibiFichaTecnica(){
    System.out.println("Nome:" + titulo);
    System.out.println("Ano lancamento: " + anoDeLancamento);
}

public void Avalia(double nota){
    somaAvaliacao += nota; 
    totalDeAvaliacoes++; 
}

public double ObterMedia(){
    return somaAvaliacao / totalDeAvaliacoes; 
    
    
}
    
}
