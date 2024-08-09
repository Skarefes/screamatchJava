package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelo.Episodio;
import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme umFilme = new Filme("O poderoso chefão", 1970);
        Serie serie = new Serie("Lost", 2000);
        umFilme.exibirFichaTecnica();
        umFilme.setDuracaoMinutos(180);
        umFilme.avalia(8);
        umFilme.avalia(5);
        umFilme.avalia(10);
        serie.setAnoLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpPorTemp(10);
        serie.setMinutosEpisodio(50);
        System.out.println(serie.getEpPorTemp());
        serie.exibirFichaTecnica();
        System.out.println("Duração total do Lost: " + serie.getDuracaoMinutos());
        System.out.println("-------");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoMinutos(200);
        calculadora.inclui(umFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTot());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(umFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotVisu(300);
        filtro.filtra(episodio);

        Filme filmenovo = new Filme("DogVille", 2003);
        filmenovo.setDuracaoMinutos(200);
        filmenovo.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(umFilme);
        listaFilmes.add(outroFilme);
        listaFilmes.add(filmenovo);

        System.out.println("Tamanho da Lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println("Segundo filme: " + listaFilmes.get(1).getNome());
        System.out.println(listaFilmes);
        System.out.println("-------");
    }
}