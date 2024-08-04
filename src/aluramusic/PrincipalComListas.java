/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluramusic;

import aluramusic.musicas.Musicas;
import aluramusic.podcasts.Podcast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class PrincipalComListas {

    public static void main(String[] args) {

        // Criando exemplos com listas mais genéricas.
        var m11 = new Musicas("AcDc", 1980, "Rock");
        var m22 = new Musicas("Kiss", 1985, "Rock");
        var m33 = new Musicas("qualquer musica ruim", 2000, "MPB");
        var p1 = new Podcast("Sober Java", 2024, "Java");
        var p2 = new Podcast("Papo de TI", 2023, "Spring Boot");

        ArrayList<CadastroGeral> listaGeral = new ArrayList<CadastroGeral>();
        // Adicionando listasGeral musicas e podcast.
        listaGeral.add(p2);
        listaGeral.add(m33);
        listaGeral.add(p1);
        listaGeral.add(m22);
        listaGeral.add(m11);
        listaGeral.sort(Comparator.comparing(CadastroGeral::getAnoLancamento));

        System.out.println("Tamanho sa lista Geral: " + listaGeral.size());
        // Ordenando lista objetos com a interface Compa.rable<>
        //Na classe CadastroGeral o metodo compareTo() foi reescrito.
        System.out.println("Lista não ordenada: " + listaGeral);
        Collections.sort(listaGeral);
        System.out.println("Lista Ordenada com o compareTo(): " + listaGeral);
        
        // Comparando pelo ano.
        listaGeral.sort(Comparator.comparing(CadastroGeral::getAnoLancamento));
        System.out.println("Comparando pelo ano: " + listaGeral);
        // Iterando a lista.
        for (CadastroGeral item : listaGeral) {
            // instanceof para mostrar somente os podcast.
            if (item instanceof Podcast) {
                Podcast podcast = (Podcast) item;// casting
                System.out.println("Item: " + item);
            }
        }

        // Ordenando a lista.
        // Criando um ArrayList de String
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("laranja");
        listaString.add("abacate");
        listaString.add("goiaba");
        listaString.add("banana");
        
        System.out.println(listaString);
        // Chamando o Collections.sort() que esta na classe java.util.
        //É um método statico e não precisa ser instanciado.
        Collections.sort(listaString);
        System.out.println(listaString);
        
        
        

    }

}
