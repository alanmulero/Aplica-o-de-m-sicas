/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic.podcasts;

import aluramusic.CadastroGeral;
import aluramusic.classificacao.Classificavel;
import java.util.Scanner;

/**
 *
 * @author alan
 */

public class Podcast extends CadastroGeral implements Classificavel {

private String temaPodcast;
private int nota;
Scanner leitura = new Scanner(System.in);
    
    public Podcast(String nomeAutorArtista, int anoLancamento, String tema) {
        super(nomeAutorArtista, anoLancamento);
        this.temaPodcast = tema;
        
       
        
    }

    public String getTemaPodcast() {
        return temaPodcast;
    }

    public int getNota() {
        return this.nota;
    }
    
    

    @Override
    public int getClassificacao() {
        System.out.println("Digite uma nota de 1 até 3 para o podcast: ");
        this.nota = leitura.nextInt();
        return this.nota;
    }

    @Override
    public String toString() {
        return super.getNomeAutorArtista();
    }

    
    
    
    
    
    
}
