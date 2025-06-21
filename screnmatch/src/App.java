import com.screenmatch.modelos.Episodios;
import com.screenmatch.modelos.Filme;
import com.screenmatch.modelos.Serie;
import com.screenmatch.modelos.Titulo;

import coom.screenmatch.calculadora.CalculadoraDeTempo;
import coom.screenmatch.calculadora.FiltroRecomendacao;



public class App {
    public static void main(String[] args) throws Exception {
       
       
       
       Filme meuFilme = new Filme(); 
       meuFilme.setTitulo("Blade runner");
       meuFilme.setAnoDeLancamento(2017);
       meuFilme.setDuracaoEmMinutos(200);  
       meuFilme.ExibiFichaTecnica();
        
       System.out.println(meuFilme.getDuracaoEmMinutos());
       System.out.println(meuFilme.getSomaAvaliacao());
       System.out.println(meuFilme.getTotalDeAvaliacoes());
       System.out.println(meuFilme.ObterMedia());

       System.out.println("-------------------------");



       Filme meuFilme2 = new Filme(); 
       meuFilme2.setTitulo("Clube de luta");
       meuFilme2.setAnoDeLancamento(2008);
       meuFilme2.setDuracaoEmMinutos(2000);
       meuFilme2.setIncluindoNoPlano(true);

        System.out.println("-------------------------");

       Serie novaSerie = new Serie();
       novaSerie.setTitulo("Breaking bad"); 
       novaSerie.setAnoDeLancamento(2014);
       novaSerie.setTemporadas(13);
       novaSerie.setEpisodiosTemporadas(32);
       novaSerie.setMinutosEpisidios(50);
       novaSerie.ExibiFichaTecnica();
       novaSerie.getDuracaoEmMinutos(); 

       System.out.println("----------------------------");

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(novaSerie);
       System.out.println(calculadora.getTempoTotal());


       FiltroRecomendacao filtro = new FiltroRecomendacao();
       filtro.filtra(meuFilme);

       Episodios episodio = new Episodios(); 
       episodio.setNumero(1);
       episodio.setSerie(novaSerie);
       episodio.setTotalDeAvaliacoes(100);
       filtro.filtra(episodio);

    }
}
