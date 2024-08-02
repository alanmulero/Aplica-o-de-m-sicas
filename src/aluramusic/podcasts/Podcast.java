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
        
        System.out.println("Digite uma nota para o Podcast de 1 até 3:  ");
        this.nota = leitura.nextInt();
        
    }

    public String getTemaPodcast() {
        return temaPodcast;
    }

    public int getNota() {
        return nota;
    }
    
    

    @Override
    public int getClassificacao() {
        return getNota();
    }

 
    
    
    
    
    
}
