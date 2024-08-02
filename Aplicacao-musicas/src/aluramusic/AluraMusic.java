/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluramusic;

import aluramusic.musicas.Musicas;

/**
 *
 * @author alan toledo
 */
public class AluraMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando.

        var m1 = new Musicas("AcDc", 1980, "Rock");
        var m2 = new Musicas("Kiss", 1976, "Rock");

        System.out.println(m1.getAnoLancamento());
        System.out.println(m1.getNomeAutorArtista());
        System.out.println(m1.getGeneroMusical());
        m1.totalGeral();

    }

}
