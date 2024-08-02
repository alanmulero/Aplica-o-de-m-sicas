/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic.podcasts;

import aluramusic.CadastroGeral;

/**
 *
 * @author alan
 */

public class Podcast extends CadastroGeral {

private String temaPodcast;
    
    public Podcast(String nomeAutorArtista, int anoLancamento, String tema) {
        super(nomeAutorArtista, anoLancamento);
        this.temaPodcast = tema;
    }

    public String getTemaPodcast() {
        return temaPodcast;
    }
    
    
    
}
