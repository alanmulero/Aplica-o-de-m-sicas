/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluramusic;

import aluramusic.classificacao.FiltroClassificacao;
import aluramusic.musicas.Musicas;
import aluramusic.podcasts.Podcast;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author alan toledo date 1/08/24
 * 3/8/24 Iniciando o uso de listas. 
 * Biblioteca Java Collections,
 */
public class AluraMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando Scanner.
        Scanner leitura = new Scanner(System.in);

        var m1 = new Musicas("AcDc", 1980, "Rock");
        var m2 = new Musicas("Kiss", 1985, "Rock");
        var m3 = new Musicas("qualquer musica ruim", 2000, "MPB");

        System.out.println(m1.getAnoLancamento());
        System.out.println(m1.getNomeAutorArtista());
        System.out.println(m1.getGeneroMusical());
        m1.totalGeral();

        //Instanciando filtro de recomendações.
        var filtro = new FiltroClassificacao();
        filtro.filtroRecomendacao(m1);
        filtro.filtroRecomendacao(m1);
        filtro.filtroRecomendacao(m1);

         //Instanciando podcast
        var p1 = new Podcast("Papo de TI", 2024, "Java");
        var p2 = new Podcast("Papo de TI", 2024, "Spring Boot");
        var podcast4 = new Podcast("Alura", 2022, "Java Swing");
        filtro.filtroRecomendacao(p1);
        
        // Criando o objeto lista de musucas.
        ArrayList<Musicas> listaDeMusicas = new ArrayList<>();
        //Adicionanso musicas na lista.
        listaDeMusicas.add(m3);
        listaDeMusicas.add(m1);
        listaDeMusicas.add(m2);
        //listaDeMusicas.add(p1); Em uma lista do tipo musica não cabe podcast.
        
        // Conferindo tamanho da lista.
        System.out.println(listaDeMusicas.size());
        // Primeiro elemento da lisat.
        System.out.println("Primeiro elemento: " + listaDeMusicas.get(0).getNomeAutorArtista());
        // Chamando a lista todo e invocando o método toString() em músicas.
        System.out.println(listaDeMusicas);
                
                
                
                
                
                
    }

}
