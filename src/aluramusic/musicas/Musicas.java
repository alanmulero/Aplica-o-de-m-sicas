/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic.musicas;

import aluramusic.CadastroGeral;

/**
 *
 * @author alan
 */
public class Musicas extends CadastroGeral {

    private String generoMusical;

    public Musicas(String nomeAutorArtista, int anoLancamento, String generoMusical) {

        super(nomeAutorArtista, anoLancamento);
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }
    
    

}
