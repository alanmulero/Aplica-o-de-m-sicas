/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluramusic;

import aluramusic.classificacao.FiltroClassificacao;
import aluramusic.musicas.Musicas;
import aluramusic.podcasts.Podcast;
import java.util.Scanner;

/**
 *
 * @author alan toledo date 1/08/24
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

        // Instanciando podcast
        var p1 = new Podcast("Papo de TI", 2024, "Java");
        var p2 = new Podcast("Papo de TI", 2024, "Spring Boot");
        filtro.filtroRecomendacao(p1);
        filtro.filtroRecomendacao(p2);

    }

}
