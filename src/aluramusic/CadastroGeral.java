/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic;

/**
 *
 * @author alan
 */
public abstract class CadastroGeral {
    private static int totalGeralReproducoes;
    private String nomeAutorArtista;
    private int anoLancamento;
    public CadastroGeral(String nomeAutorArtista,int anoLancamento) {
        this.nomeAutorArtista = nomeAutorArtista;
        this.anoLancamento = anoLancamento;
        totalGeralReproducoes ++;
    }

    public static int getTotalGeralReproducoes() {
        return totalGeralReproducoes;
    }
    

    public String getNomeAutorArtista() {
        return nomeAutorArtista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    public void totalGeral(){
        System.out.println("Toral geral de reproduções do aplicativo: " + this.totalGeralReproducoes);
}
}