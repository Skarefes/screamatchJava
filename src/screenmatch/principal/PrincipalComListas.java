package screenmatch.principal;

import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;
import screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme umFilme = new Filme("O poderoso chefão", 1970);
        umFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeNovo = new Filme("Dogville", 2003);
        filmeNovo.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Filme filme2 = new Filme("LOTRO", 1999);
        filme2.avalia(6);
        Serie umaSerie = new Serie("Lost", 2002);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(umFilme);
        lista.add(outroFilme);
        lista.add(filmeNovo);
        lista.add(filme2);
        lista.add(umaSerie);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Jacqueline");
        buscaArtista.add("Canderson");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da odrdenação");
        System.out.println(buscaArtista);
        System.out.println("Lista de titulos ordedanos");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Comparando por ano");
        System.out.println(lista);
    }
}
