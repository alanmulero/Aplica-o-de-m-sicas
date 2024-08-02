/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic.musicas;

import aluramusic.CadastroGeral;
import aluramusic.classificacao.Classificavel;
import java.util.Scanner;


/**
 *
 * @author alan
 */
public class Musicas extends CadastroGeral implements Classificavel{

    private String generoMusical;
    private int quantidadeReproducao;

    public Musicas(String nomeAutorArtista, int anoLancamento, String generoMusical) {

        super(nomeAutorArtista, anoLancamento);
        this.generoMusical = generoMusical;
        this.quantidadeReproducao ++;
    }
     Scanner leitura = new Scanner(System.in);

    public String getGeneroMusical() {
        return generoMusical;
    }

    public int getQuantidadeReproducao() {
        return quantidadeReproducao;
    }

    @Override
    public int getClassificacao() {
        System.out.println("Digite uma nota de 1 até 3 para essa musica: ");
        int num = leitura.nextInt();
        return num;
    }
    
    

}
