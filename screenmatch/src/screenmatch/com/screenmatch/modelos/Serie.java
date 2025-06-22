package com.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosTemporadas; 
    private int minutosEpisidios; 
    private boolean ativa; 


public int getTemporadas(){
    return temporadas; 
}

public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
}

public int getEpisodiosTemporadas(){
    return episodiosTemporadas; 
}

public void setEpisodiosTemporadas(int episodiosTemporadas) {
    this.episodiosTemporadas = episodiosTemporadas;
}

public int getMinutosEpisidios() {
    return minutosEpisidios;
}

public void setMinutosEpisidios(int minutosEpisidios) {
    this.minutosEpisidios = minutosEpisidios;
}

public boolean isativa() {
    return ativa;
}

public void istativa(boolean ativa) {
    this.ativa = ativa;
}

@Override
public int getDuracaoEmMinutos(){
    return temporadas * episodiosTemporadas * minutosEpisidios; 
}

}







