package com.screenmatch.calculadora;

public class FiltroRecomendacao {
    private String recomendacao; 

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
               System.out.println("Esta entre os prefeiridos do momento.");     
        }   else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado no momento.");
        }   else {
            System.out.println("Coloque na sua lista para assisir depois.");
        }
    }
    
}
