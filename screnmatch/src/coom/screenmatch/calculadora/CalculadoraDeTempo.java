package coom.screenmatch.calculadora;
import com.screenmatch.modelos.Serie;
import com.screenmatch.modelos.Filme;
import com.screenmatch.modelos.Titulo; 

public class CalculadoraDeTempo {

    private int tempoTotal = 0; 
    
    public int getTempoTotal() {
        return tempoTotal;
    }


   
    /* public void SomaTotal(Filme f ){
         this.tempoTotal += f.getDuracaoEmMinutos(); 
    } */
    
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos(); 
    }
}
