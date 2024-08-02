/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic.classificacao;

/**
 *
 * @author alan
 */
public class FiltroClassificacao {
    
    public void filtroRecomendacao(Classificavel classificavel){
        int item = classificavel.getClassificacao();
        switch (item) {
            case 3:
                System.out.println("Altamente recomendado!");
                break;
            case 2:
                System.out.println("Recomendação regular.");
                break;
            case 1:
                System.out.println("Não recomendado.");
                break;
            default:
                System.out.println("A nota é invalida.");;
        }
    
    
    }
}
